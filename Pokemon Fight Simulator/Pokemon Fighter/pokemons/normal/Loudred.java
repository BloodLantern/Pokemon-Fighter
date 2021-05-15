package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Loudred extends Whismur {

	public Loudred() {

		this.setName("Loudred");
		this.generateIVs();
		initStats();

	}

	public Loudred(int level) {

		this.setName("Loudred");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Loudred(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Loudred(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(84);
		this.setBaseAtk(71);
		this.setBaseDef(43);
		this.setBaseSpAtk(71);
		this.setBaseSpDef(43);
		this.setBaseSpeed(48);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
