package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Comfey extends Pokemon {

	public Comfey() {

		this.setName("Comfey");
		this.generateIVs();
		initStats();

	}

	public Comfey(int level) {

		this.setName("Comfey");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Comfey(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Comfey(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(51);
		this.setBaseAtk(52);
		this.setBaseDef(90);
		this.setBaseSpAtk(82);
		this.setBaseSpDef(110);
		this.setBaseSpeed(100);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
