package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Eevee extends Pokemon {

	public Eevee() {

		this.setName("Eevee");
		this.generateIVs();
		initStats();

	}

	public Eevee(int level) {

		this.setName("Eevee");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Eevee(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Eevee(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(55);
		this.setBaseAtk(55);
		this.setBaseDef(50);
		this.setBaseSpAtk(45);
		this.setBaseSpDef(65);
		this.setBaseSpeed(55);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
