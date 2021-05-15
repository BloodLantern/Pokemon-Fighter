package pokemons.ground;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Larvitar extends Pokemon {

	public Larvitar() {

		this.setName("Larvitar");
		this.generateIVs();
		initStats();

	}

	public Larvitar(int level) {

		this.setName("Larvitar");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Larvitar(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Larvitar(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.GROUND);
		this.setType2(Types.ROCK);
		this.setBaseHP(50);
		this.setBaseAtk(64);
		this.setBaseDef(50);
		this.setBaseSpAtk(45);
		this.setBaseSpDef(50);
		this.setBaseSpeed(41);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
