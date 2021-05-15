package pokemons.ice;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;
import pokemons.normal.Eevee;

public class Glaceon extends Eevee {

	public Glaceon() {

		this.setName("Glaceon");
		this.generateIVs();
		initStats();

	}

	public Glaceon(int level) {

		this.setName("Glaceon");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Glaceon(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Glaceon(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.ICE);
		this.setBaseHP(65);
		this.setBaseAtk(60);
		this.setBaseDef(110);
		this.setBaseSpAtk(130);
		this.setBaseSpDef(95);
		this.setBaseSpeed(65);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
