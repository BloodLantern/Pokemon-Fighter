package pokemons.grass;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Bulbasaur extends Pokemon {

	public Bulbasaur() {

		this.setName("Bulbasaur");
		this.generateIVs();
		initStats();

	}

	public Bulbasaur(int level) {

		this.setName("Bulbasaur");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Bulbasaur(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Bulbasaur(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.GRASS);
		this.setType2(Types.POISON);
		this.setBaseHP(45);
		this.setBaseAtk(49);
		this.setBaseDef(49);
		this.setBaseSpAtk(65);
		this.setBaseSpDef(65);
		this.setBaseSpeed(45);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
