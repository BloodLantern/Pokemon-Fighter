package pokemons.electric;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;
import pokemons.normal.Eevee;

public class Jolteon extends Eevee {

	public Jolteon() {

		this.setName("Jolteon");
		this.generateIVs();
		initStats();

	}

	public Jolteon(int level) {

		this.setName("Jolteon");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Jolteon(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Jolteon(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.ELECTRIC);
		this.setBaseHP(65);
		this.setBaseAtk(65);
		this.setBaseDef(60);
		this.setBaseSpAtk(110);
		this.setBaseSpDef(95);
		this.setBaseSpeed(130);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
