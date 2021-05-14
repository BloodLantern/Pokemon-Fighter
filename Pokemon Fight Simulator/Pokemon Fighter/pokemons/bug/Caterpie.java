package pokemons.bug;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Caterpie extends Pokemon {

	public Caterpie() {

		this.setName("Caterpie");
		this.generateIVs();
		initStats();

	}

	public Caterpie(int level) {

		this.setName("Caterpie");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Caterpie(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Caterpie(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.BUG);
		this.setBaseHP(45);
		this.setBaseAtk(30);
		this.setBaseDef(35);
		this.setBaseSpAtk(20);
		this.setBaseSpDef(20);
		this.setBaseSpeed(45);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
