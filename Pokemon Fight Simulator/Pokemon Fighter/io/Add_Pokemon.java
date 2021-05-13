package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.regex.Pattern;

import pokemons.Pokemon;
import pokemons.Types;

/**
 * This class is used to add a new Pokemon file to the project.
 * <p>
 * It is used in {@link gui.AddPokemonWindow} but may be used manually
 * 
 * @author BloodLantern
 */
public abstract class Add_Pokemon {
	
	private static File file = null;

	public static void generate(String name, Types type, Types type2, int hp, int atk, int def, int spatk, int spdef, int speed, String evolve) {

		boolean operationSuccess = true;
		FileWriter writer = null;
		Types evolveType = null;
		
		if (!evolve.equals("Pokemon")) {
			
			// Getting evolve's type
			System.out.println("Scanning for " + evolve + "'s type equivalence...");
			FolderScanner fs = new FolderScanner(Paths.get("Pokemon Fighter\\pokemons"), evolve + ".java");
			int processors = Runtime.getRuntime().availableProcessors();
			ForkJoinPool pool = new ForkJoinPool(processors);
			long start = System.currentTimeMillis();
			pool.invoke(fs);
			Scanner sc = null;
			if (fs.getResult() == 1) {
				System.out.println("File found !\nTime spent: " + (System.currentTimeMillis() - start) + "ms\n\nReading file...");
				try {
					sc = new Scanner(fs.getFilesList().get(0));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < 44; i++)
					sc.nextLine();
				String found = sc.nextLine();
				found = found.replaceAll("		this.setType\\(Types.", "");
				found = found.replaceAll("\\);", "");
				System.out.println("Type found -> " + found + "\n\nLooking for this type in Type enum...");
				boolean redo = false;
				
				do {
					try {
						evolveType = Types.valueOf(found);
						System.out.println("Type found !");
						redo = false;
					} catch (java.lang.IllegalArgumentException e) {
						redo = true;
						System.err.println("Illegal argument -> " + found + "\nThis isn't a valid Pokemon type !");
						System.out.println("Wondering for the true type...");
						sc.close();
						Scanner sc_ = null;
						try {
							sc_ = new Scanner(fs.getFilesList().get(0));
						} catch (FileNotFoundException a) {
							a.printStackTrace();
						}
						for (int i = 0; i < 43; i++)
							sc_.nextLine();
						found = sc_.nextLine();
						found = found.replaceAll("		this.setType\\(Types.", "");
						found = found.replaceAll("\\);", "");
						System.out.println("Type found -> " + found + "\n\nLooking for this type in Type enum...");
					}
				} while (redo);
			} else {
				System.out.println("There was an error during process ! :(");
			}
			
		}
		
		if (type2 != null) {
			System.out.println("\nCreating new Pokemon " + name + " of type " + type.toString() + "-" + type2.toString() + " evolving from " + evolve + " with stats:\nHPs: " + hp + "\nAtk: " + atk + "\nDef: " + def + "\nSpAtk: " + spatk + "\nSpDef: " + spdef + "\nSpeed: " + speed);
		} else {
			System.out.println("\nCreating new Pokemon " + name + " of type " + type.toString() + " evolving from " + evolve + " with stats:\nHPs: " + hp + "\nAtk: " + atk + "\nDef: " + def + "\nSpAtk: " + spatk + "\nSpDef: " + spdef + "\nSpeed: " + speed);
		}
		
		file = new File("Pokemon Fighter\\pokemons\\" + type.toString().toLowerCase() + "\\" + name + ".java");
		
		long timer = System.currentTimeMillis();
		
		try {
			if (!file.exists()) {
				file.createNewFile();
				
				try {

					writer = new FileWriter(file);
					writer.write("package pokemons." + type.toString().toLowerCase() + ";\r\n"
							+ "\r\n"
							+ "import pokemons.Natures;\r\n");
					if (evolve.equals("Pokemon")) {
						writer.write("import pokemons.Pokemon;\r\n");
					} else {
						if (!evolveType.equals(type)) {
							writer.write("import pokemons." + evolveType.toString().toLowerCase() + "." + evolve + ";\r\n");
						}
					}
					writer.write("import pokemons.Types;\r\n"
							+ "\r\n"
							+ "public class " + name + " extends " + evolve + " {\r\n"
							+ "\r\n"
							+ "public " + name + "() {\r\n"
							+ "		\r\n"
							+ "		this.setName(\"" + name + "\");\r\n"
							+ "		this.generateIVs();\r\n"
							+ "		initStats();\r\n"
							+ "		\r\n"
							+ "	}\r\n"
							+ "	\r\n"
							+ "	public " + name + "(int level) {\r\n"
							+ "		\r\n"
							+ "		this.setName(\"" + name + "\");\r\n"
							+ "		this.setLevel(level);\r\n"
							+ "		this.generateIVs();\r\n"
							+ "		initStats();\r\n"
							+ "		\r\n"
							+ "	}\r\n"
							+ "	\r\n"
							+ "	public " + name + "(String name) {\r\n"
							+ "		\r\n"
							+ "		this.setName(name);\r\n"
							+ "		this.generateIVs();\r\n"
							+ "		initStats();\r\n"
							+ "		\r\n"
							+ "	}\r\n"
							+ "	\r\n"
							+ "	public " + name + "(String name, int level) {\r\n"
							+ "		\r\n"
							+ "		this.setName(name);\r\n"
							+ "		this.setLevel(level);\r\n"
							+ "		this.generateIVs();\r\n"
							+ "		initStats();\r\n"
							+ "		\r\n"
							+ "	}\r\n"
							+ "	\r\n"
							+ "	@Override\r\n"
							+ "	protected void initStats() {\r\n"
							+ "		this.setType(Types." + type + ");\r\n");
					if (type2 != null)
						writer.write("		this.setType2(Types." + type2 + ");\r\n");
					writer.write("		this.setBaseHP(" + hp + ");\r\n"
							+ "		this.setBaseAtk(" + atk + ");\r\n"
							+ "		this.setBaseDef(" + def +");\r\n"
							+ "		this.setBaseSpAtk(" + spatk + ");\r\n"
							+ "		this.setBaseSpDef(" + spdef + ");\r\n"
							+ "		this.setBaseSpeed(" + speed +");\r\n"
							+ "		this.setNature(Natures.randomNature());\r\n"
							+ "		this.calculateStats();\r\n"
							+ "	}\r\n"
							+ "}\r\n"
							);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
					operationSuccess = false;
				} catch (IOException e) {
					e.printStackTrace();
					operationSuccess = false;
				} finally {

					try {
						if (writer != null)
							writer.close();
					} catch (IOException e) {
						e.printStackTrace();
						operationSuccess = false;
					}

				}
				
			} else {
				System.err.println("Pokemon file '" + name + "' does already exists !\nStopping the process.");
				operationSuccess = false;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			operationSuccess = false;
		}

		

		if (operationSuccess) {
			System.out.println("New pokemon file created at '" + file.getAbsolutePath() + "' ! (" + (System.currentTimeMillis() - timer) + "ms)\nYou may need to refresh the " + type.toString() + " package");
		} else {
			System.err.println("An error has occured :(");
		}

	}

}
