package pokemons.water;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Poliwhirl extends Poliwag {

	public Poliwhirl() {

		this.setName("Poliwhirl");
		this.generateIVs();
		initStats();

	}

	public Poliwhirl(int level) {

		this.setName("Poliwhirl");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Poliwhirl(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Poliwhirl(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setBaseHP(65);
		this.setBaseAtk(65);
		this.setBaseDef(65);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(90);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
