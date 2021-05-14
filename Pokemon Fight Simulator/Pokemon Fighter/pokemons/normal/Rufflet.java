package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Rufflet extends Pokemon {

	public Rufflet() {

		this.setName("Rufflet");
		this.generateIVs();
		initStats();

	}

	public Rufflet(int level) {

		this.setName("Rufflet");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Rufflet(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Rufflet(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setType2(Types.FLYING);
		this.setBaseHP(70);
		this.setBaseAtk(83);
		this.setBaseDef(50);
		this.setBaseSpAtk(37);
		this.setBaseSpDef(50);
		this.setBaseSpeed(60);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
