package pokemons.ground;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Geodude extends Pokemon {

	public Geodude() {

		this.setName("Geodude");
		this.generateIVs();
		initStats();

	}

	public Geodude(int level) {

		this.setName("Geodude");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Geodude(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Geodude(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.GROUND);
		this.setType2(Types.ROCK);
		this.setBaseHP(40);
		this.setBaseAtk(80);
		this.setBaseDef(100);
		this.setBaseSpAtk(30);
		this.setBaseSpDef(30);
		this.setBaseSpeed(20);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
