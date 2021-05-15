package pokemons.water;

import pokemons.Natures;
import pokemons.normal.Azurill;
import pokemons.Types;

public class Marill extends Azurill {

	public Marill() {

		this.setName("Marill");
		this.generateIVs();
		initStats();

	}

	public Marill(int level) {

		this.setName("Marill");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Marill(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Marill(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setType2(Types.FAIRY);
		this.setBaseHP(70);
		this.setBaseAtk(20);
		this.setBaseDef(50);
		this.setBaseSpAtk(20);
		this.setBaseSpDef(50);
		this.setBaseSpeed(40);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
