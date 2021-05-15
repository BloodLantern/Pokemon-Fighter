package pokemons.water;

import pokemons.Natures;
import pokemons.Types;

public class Wartortle extends Squirtle {

	public Wartortle() {

		this.setName("Wartortle");
		this.generateIVs();
		initStats();

	}

	public Wartortle(int level) {

		this.setName("Wartortle");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Wartortle(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Wartortle(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setBaseHP(59);
		this.setBaseAtk(63);
		this.setBaseDef(80);
		this.setBaseSpAtk(65);
		this.setBaseSpDef(80);
		this.setBaseSpeed(58);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
