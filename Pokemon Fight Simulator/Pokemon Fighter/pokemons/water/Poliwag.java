package pokemons.water;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Poliwag extends Pokemon {

	public Poliwag() {

		this.setName("Poliwag");
		this.generateIVs();
		initStats();

	}

	public Poliwag(int level) {

		this.setName("Poliwag");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Poliwag(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Poliwag(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setBaseHP(40);
		this.setBaseAtk(50);
		this.setBaseDef(40);
		this.setBaseSpAtk(40);
		this.setBaseSpDef(40);
		this.setBaseSpeed(90);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
