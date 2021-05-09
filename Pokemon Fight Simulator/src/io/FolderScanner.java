package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

import exceptions.ScanException;

public class FolderScanner extends RecursiveTask<Long> {

	private Path path = null;
	private String filter = "*";
	private long result = 0;
	private ArrayList<File> filesList = new ArrayList<File>();
	private ArrayList<File> blackList = new ArrayList<File>();

	public FolderScanner() {
	}

	public FolderScanner(Path p, String f) {
		path = p;
		filter = f;
	}

	public long sequentialScan() throws ScanException {
		if (path == null || path.equals(""))
			throw new ScanException("Invalid path ! (or null)");

		System.out.println("Scanning folder: '" + path + "' looking for files with extension '" + this.filter + "'");

		try (DirectoryStream<Path> listing = Files.newDirectoryStream(path)) {
			for (Path name : listing) {
				if (Files.isDirectory(name.toAbsolutePath())) {
					FolderScanner f = new FolderScanner(name.toAbsolutePath(), this.filter);
					result += f.sequentialScan();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (DirectoryStream<Path> listing = Files.newDirectoryStream(path, this.filter)) {
			for (Path name : listing) {
				if (!blackList.isEmpty()) {
					boolean isInBlackList = false;
					for (int i = 0; i < blackList.size(); i++) {
						if (new File(name.toString()).equals(blackList.get(i))) {
							isInBlackList = true;
							System.err.println("Bypassing file '" + name.toString() + "' because it is in blackList -> '" + blackList.get(i).toString() + "'");
						}
					}
					if (!isInBlackList) {
						System.out.println("Adding file '" + name.toString() + "' to filesList because it isn't in blackList");
						filesList.add(new File(name.toString()));
						result++;
					}
				} else {
					System.out.println("Adding file '" + name.toString() + "' to filesList because blackList is empty");
					filesList.add(new File(name.toString()));
					result++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	public long parallelScan() throws ScanException {
		System.out.println("Beginning new scan...");
		for (File f : blackList)
			System.out.println("BlackList contains element '" + f.toString() + "' of absolute path '" + f.getAbsolutePath() + "'");
		List<FolderScanner> list = new ArrayList<>();

		if (path == null || path.equals(""))
			throw new ScanException("Invalid path ! (or null)");

		System.out.println("Scanning folder: '" + path + "' looking for files with extension " + this.filter);

		try (DirectoryStream<Path> listing = Files.newDirectoryStream(path)) {
			for (Path name : listing) {
				if (Files.isDirectory(name.toAbsolutePath())) {
					FolderScanner f = new FolderScanner(name.toAbsolutePath(), this.filter);
					list.add(f);
					f.fork();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (DirectoryStream<Path> listing = Files.newDirectoryStream(path, this.filter)) {
			for (Path name : listing) {
				if (!blackList.isEmpty()) {
					boolean isInBlackList = false;
					for (int i = 0; i < blackList.size(); i++) {
						if (new File(name.toString()).equals(blackList.get(i))) {
							isInBlackList = true;
							System.err.println("Bypassing file '" + name.toString() + "' because it is in blackList -> '" + blackList.get(i).toString() + "'");
						}
					}
					if (!isInBlackList) {
						System.out.println("Adding file '" + name.toString() + "' to filesList because it isn't in blackList");
						filesList.add(new File(name.toString()));
						result++;
					}
				} else {
					System.out.println("Adding file '" + name.toString() + "' to filesList because blackList is empty");
					filesList.add(new File(name.toString()));
					result++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (FolderScanner f : list) {
			result += f.join();
			for (int i = 0; i < f.getFilesList().size(); i++)
				filesList.add(f.getFilesList().get(i));
		}

		return result;
	}

	@Override
	protected Long compute() {
		long result = 0;
		try {
			result = this.parallelScan();
		} catch (ScanException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void addToBlackList(String path) {
		this.blackList.add(new File(path));
	}

	public long getResult() {
		return this.result;
	}

	public ArrayList<File> getFilesList() {
		return this.filesList;
	}

	public void reset() {
		this.filesList.clear();
		this.result = 0;
	}

}