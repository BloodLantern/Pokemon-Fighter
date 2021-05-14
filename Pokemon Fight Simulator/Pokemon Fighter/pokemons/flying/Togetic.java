package pokemons.flying;

import pokemons.Natures;
import pokemons.fairy.Togepi;
import pokemons.Types;

public class Togetic extends Togepi {

	public Togetic() {

		this.setName("Togetic");
		this.generateIVs();
		initStats();

	}

	public Togetic(int level) {

		this.setName("Togetic");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Togetic(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Togetic(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.FLYING);
		this.setType2(Types.FAIRY);
		this.setBaseHP(55);
		this.setBaseAtk(40);
		this.setBaseDef(85);
		this.setBaseSpAtk(80);
		this.setBaseSpDef(105);
		this.setBaseSpeed(40);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
