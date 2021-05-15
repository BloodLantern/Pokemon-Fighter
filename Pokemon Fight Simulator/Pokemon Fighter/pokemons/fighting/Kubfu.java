package pokemons.fighting;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Kubfu extends Pokemon {

	public Kubfu() {

		this.setName("Kubfu");
		this.generateIVs();
		initStats();

	}

	public Kubfu(int level) {

		this.setName("Kubfu");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Kubfu(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Kubfu(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.FIGHTING);
		this.setBaseHP(60);
		this.setBaseAtk(90);
		this.setBaseDef(60);
		this.setBaseSpAtk(53);
		this.setBaseSpDef(50);
		this.setBaseSpeed(72);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
