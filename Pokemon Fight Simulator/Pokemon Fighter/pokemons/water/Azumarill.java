package pokemons.water;

import pokemons.Natures;
import pokemons.Types;

public class Azumarill extends Marill {

	public Azumarill() {

		this.setName("Azumarill");
		this.generateIVs();
		initStats();

	}

	public Azumarill(int level) {

		this.setName("Azumarill");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Azumarill(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Azumarill(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setType2(Types.FAIRY);
		this.setBaseHP(100);
		this.setBaseAtk(50);
		this.setBaseDef(80);
		this.setBaseSpAtk(60);
		this.setBaseSpDef(80);
		this.setBaseSpeed(50);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
