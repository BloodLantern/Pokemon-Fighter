package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Braviary extends Rufflet {

	public Braviary() {

		this.setName("Braviary");
		this.generateIVs();
		initStats();

	}

	public Braviary(int level) {

		this.setName("Braviary");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Braviary(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Braviary(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setType2(Types.FLYING);
		this.setBaseHP(100);
		this.setBaseAtk(123);
		this.setBaseDef(75);
		this.setBaseSpAtk(57);
		this.setBaseSpDef(75);
		this.setBaseSpeed(80);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
