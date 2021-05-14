package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Clefairy extends Cleffa {

	public Clefairy() {

		this.setName("Clefairy");
		this.generateIVs();
		initStats();

	}

	public Clefairy(int level) {

		this.setName("Clefairy");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Clefairy(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Clefairy(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(70);
		this.setBaseAtk(45);
		this.setBaseDef(48);
		this.setBaseSpAtk(60);
		this.setBaseSpDef(65);
		this.setBaseSpeed(35);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
