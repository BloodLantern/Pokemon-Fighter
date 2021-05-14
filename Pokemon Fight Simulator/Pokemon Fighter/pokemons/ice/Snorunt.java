package pokemons.ice;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Snorunt extends Pokemon {

	public Snorunt() {

		this.setName("Snorunt");
		this.generateIVs();
		initStats();

	}

	public Snorunt(int level) {

		this.setName("Snorunt");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Snorunt(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Snorunt(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.ICE);
		this.setBaseHP(50);
		this.setBaseAtk(50);
		this.setBaseDef(50);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(50);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
