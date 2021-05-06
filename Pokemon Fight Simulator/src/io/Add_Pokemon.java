package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import pokemons.Types;

public abstract class Add_Pokemon {
	
	private static File file = null;

	public static void generate() {

		boolean operationSuccess = true;
		FileWriter writer = null;
		Scanner params = new Scanner(System.in);
		
		String name;
		Types type;
		int hp;
		int atk;
		int def;
		int spatk;
		int spdef;
		int speed;
		
		System.out.print("Please input the following parameter:\nName: ");
		name = params.nextLine();
		System.out.print("\nType: ");
		type = Types.valueOf(params.nextLine().toUpperCase());
		System.out.print("\nHPs: ");
		hp = params.nextInt();
		System.out.print("\nAtk: ");
		atk = params.nextInt();
		System.out.print("\nDef: ");
		def = params.nextInt();
		System.out.print("\nSpAtk: ");
		spatk = params.nextInt();
		System.out.print("\nSpDef: ");
		spdef = params.nextInt();
		System.out.print("\nSpeed: ");
		speed = params.nextInt();

		params.close();
		
		System.out.println("\nCreating new Pokemon " + name + " with stats:\nHPs: " + hp + "\nAtk: " + atk + "\nDef: " + def + "\nSpAtk: " + spatk + "\nSpDef: " + spdef + "\nSpeed: " + speed);
		
		file = new File("src\\pokemons\\" + type.toString().toLowerCase() + "\\" + name + ".java");
		
		long timer = System.currentTimeMillis();
		
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
			operationSuccess = false;
		}

		try {

			writer = new FileWriter(file);
			writer.write("package pokemons." + type.toString().toLowerCase() + ";\r\n"
					+ "\r\n"
					+ "import pokemons.Natures;\r\n"
					+ "import pokemons.Pokemon;\r\n"
					+ "import pokemons.Types;\r\n"
					+ "\r\n"
					+ "public class " + name + " extends Pokemon {\r\n"
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
					+ "		this.setType(Types." + type + ");\r\n"
					+ "		this.setBaseHP(" + hp + ");\r\n"
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

		if (operationSuccess) {
			System.out.println("New pokemon file created ! (" + (System.currentTimeMillis() - timer) + "ms)\nYou may need to refresh the " + type.toString() + " package");
		} else {
			System.err.println("An error has occured :(");
		}

	}

}
