package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Stufful extends Pokemon {

	public Stufful() {

		this.setName("Stufful");
		this.generateIVs();
		initStats();

	}

	public Stufful(int level) {

		this.setName("Stufful");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Stufful(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Stufful(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setType2(Types.FIGHTING);
		this.setBaseHP(70);
		this.setBaseAtk(75);
		this.setBaseDef(50);
		this.setBaseSpAtk(45);
		this.setBaseSpDef(50);
		this.setBaseSpeed(50);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
