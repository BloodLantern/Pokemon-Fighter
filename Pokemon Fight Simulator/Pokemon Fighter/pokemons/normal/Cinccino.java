package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Cinccino extends Minccino {

	public Cinccino() {

		this.setName("Cinccino");
		this.generateIVs();
		initStats();

	}

	public Cinccino(int level) {

		this.setName("Cinccino");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Cinccino(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Cinccino(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(75);
		this.setBaseAtk(95);
		this.setBaseDef(60);
		this.setBaseSpAtk(65);
		this.setBaseSpDef(60);
		this.setBaseSpeed(115);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
