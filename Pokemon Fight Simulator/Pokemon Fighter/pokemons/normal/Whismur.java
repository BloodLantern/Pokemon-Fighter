package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Whismur extends Pokemon {

	public Whismur() {

		this.setName("Whismur");
		this.generateIVs();
		initStats();

	}

	public Whismur(int level) {

		this.setName("Whismur");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Whismur(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Whismur(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(64);
		this.setBaseAtk(51);
		this.setBaseDef(23);
		this.setBaseSpAtk(51);
		this.setBaseSpDef(23);
		this.setBaseSpeed(28);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
