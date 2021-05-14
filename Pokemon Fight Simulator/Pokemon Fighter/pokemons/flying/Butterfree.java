package pokemons.flying;

import pokemons.Natures;
import pokemons.Types;
import pokemons.bug.Metapod;

public class Butterfree extends Metapod {

	public Butterfree() {

		this.setName("Butterfree");
		this.generateIVs();
		initStats();

	}

	public Butterfree(int level) {

		this.setName("Butterfree");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Butterfree(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Butterfree(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.FLYING);
		this.setType2(Types.BUG);
		this.setBaseHP(60);
		this.setBaseAtk(45);
		this.setBaseDef(50);
		this.setBaseSpAtk(90);
		this.setBaseSpDef(80);
		this.setBaseSpeed(70);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
