package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Milcery extends Pokemon {

	public Milcery() {

		this.setName("Milcery");
		this.generateIVs();
		initStats();

	}

	public Milcery(int level) {

		this.setName("Milcery");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Milcery(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Milcery(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(45);
		this.setBaseAtk(40);
		this.setBaseDef(40);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(61);
		this.setBaseSpeed(34);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
