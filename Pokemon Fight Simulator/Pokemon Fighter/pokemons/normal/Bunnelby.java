package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Bunnelby extends Pokemon {

	public Bunnelby() {

		this.setName("Bunnelby");
		this.generateIVs();
		initStats();

	}

	public Bunnelby(int level) {

		this.setName("Bunnelby");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Bunnelby(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Bunnelby(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(38);
		this.setBaseAtk(36);
		this.setBaseDef(38);
		this.setBaseSpAtk(32);
		this.setBaseSpDef(36);
		this.setBaseSpeed(57);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
