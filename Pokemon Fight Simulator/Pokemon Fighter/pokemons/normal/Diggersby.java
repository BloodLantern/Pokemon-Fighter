package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Diggersby extends Bunnelby {

	public Diggersby() {

		this.setName("Diggersby");
		this.generateIVs();
		initStats();

	}

	public Diggersby(int level) {

		this.setName("Diggersby");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Diggersby(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Diggersby(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(85);
		this.setBaseAtk(56);
		this.setBaseDef(77);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(77);
		this.setBaseSpeed(78);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
