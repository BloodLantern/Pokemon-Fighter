package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Ditto extends Pokemon {

	public Ditto() {

		this.setName("Ditto");
		this.generateIVs();
		initStats();

	}

	public Ditto(int level) {

		this.setName("Ditto");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Ditto(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Ditto(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(48);
		this.setBaseAtk(48);
		this.setBaseDef(48);
		this.setBaseSpAtk(48);
		this.setBaseSpDef(48);
		this.setBaseSpeed(48);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
