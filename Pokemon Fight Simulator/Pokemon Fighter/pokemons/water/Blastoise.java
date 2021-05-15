package pokemons.water;

import pokemons.Natures;
import pokemons.Types;

public class Blastoise extends Wartortle {

	public Blastoise() {

		this.setName("Blastoise");
		this.generateIVs();
		initStats();

	}

	public Blastoise(int level) {

		this.setName("Blastoise");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Blastoise(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Blastoise(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setBaseHP(79);
		this.setBaseAtk(83);
		this.setBaseDef(100);
		this.setBaseSpAtk(85);
		this.setBaseSpDef(105);
		this.setBaseSpeed(78);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
