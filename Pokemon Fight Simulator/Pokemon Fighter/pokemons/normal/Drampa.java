package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Drampa extends Pokemon {

	public Drampa() {

		this.setName("Drampa");
		this.generateIVs();
		initStats();

	}

	public Drampa(int level) {

		this.setName("Drampa");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Drampa(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Drampa(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setType2(Types.DRAGON);
		this.setBaseHP(78);
		this.setBaseAtk(60);
		this.setBaseDef(85);
		this.setBaseSpAtk(135);
		this.setBaseSpDef(91);
		this.setBaseSpeed(36);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
