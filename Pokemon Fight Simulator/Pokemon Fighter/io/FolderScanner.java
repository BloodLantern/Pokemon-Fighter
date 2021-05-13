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

/**
 * This class is used to scan a folder and all of its subfolders by using 1 of
 * the 2 possible methods:
 * <p>
 * <ul>
 * <li>{@link io.FolderScanner#sequentialScan()}
 * <li>{@link io.FolderScanner#parallelScan()}
 * </ul>
 * 
 * @author BloodLantern
 */
public class FolderScanner extends RecursiveTask<Long> {

	/**
	 * The path of the folder to scan.
	 * <p>
	 * It is initialized in the constructor.
	 */
	private Path path = null;

	/**
	 * The filter for the files to be scanned.
	 * <p>
	 * <li>For a particular extension, use *. before your extension.
	 * <p>
	 * <li>For a particular file name, use this file name plus the extension of this
	 * file.
	 */
	private String filter = "*";

	/**
	 * This is how many files the scan has found.
	 */
	private long result = 0;

	/**
	 * This is a {@link java.util.ArrayList} containing all the files the scan
	 * founded.
	 */
	private ArrayList<File> filesList = new ArrayList<File>();

	/**
	 * This is basically a blacklist where you can add particular file paths that
	 * will be ignored during the scan.
	 */
	private ArrayList<File> blackList = new ArrayList<File>();

	public FolderScanner() {
	}

	public FolderScanner(Path p, String f) {
		path = p;
		filter = f;
	}

	/**
	 * Starts a sequential folder scan.
	 * <p>
	 * It means that it will scan the selected folder, and then all subfolders one
	 * by one.
	 * 
	 * @return The founded file count.
	 * @throws ScanException If the selected path is null or invalid.
	 * @see {@link io.FolderScanner#parallelScan()} if you want to scan all the
	 *      subfolders with different Threads to be faster.
	 */
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
							System.err.println("Bypassing file '" + name.toString()
									+ "' because it is in blackList -> '" + blackList.get(i).toString() + "'");
						}
					}
					if (!isInBlackList) {
						System.out.println(
								"Adding file '" + name.toString() + "' to filesList because it isn't in blackList");
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

	/**
	 * Starts a parallel folder scan.
	 * <p>
	 * It means that it will scan the selected folder, and all the subfolders with
	 * one new Thread for each subfolder.
	 * 
	 * @return The founded file count.
	 * @throws ScanException If the selected path is null or invalid.
	 * @see {@link io.FolderScanner#sequentialScan()} if you want to scan all the
	 *      subfolders one by one to use less resources.
	 */
	public long parallelScan() throws ScanException {
		System.out.println("Beginning new scan...");
		for (File f : blackList)
			System.out.println(
					"BlackList contains element '" + f.toString() + "' of absolute path '" + f.getAbsolutePath() + "'");
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
							System.err.println("Bypassing file '" + name.toString()
									+ "' because it is in blackList -> '" + blackList.get(i).toString() + "'");
						}
					}
					if (!isInBlackList) {
						System.out.println(
								"Adding file '" + name.toString() + "' to filesList because it isn't in blackList");
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

	/**
	 * @param path is the Path of the file you want to ignore.
	 */
	public void addToBlackList(String path) {
		this.blackList.add(new File(path));
	}

	public long getResult() {
		return this.result;
	}

	public ArrayList<File> getFilesList() {
		return this.filesList;
	}

	/**
	 * This may be used to reset all this scanner fields but it is preferred to use
	 * a new one.
	 */
	public void reset() {
		this.filesList.clear();
		this.blackList.clear();
		this.result = 0;
		this.path = null;
		this.filter = null;
	}

}