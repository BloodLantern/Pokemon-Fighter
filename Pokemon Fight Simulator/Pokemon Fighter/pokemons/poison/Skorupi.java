package pokemons.poison;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Skorupi extends Pokemon {

	public Skorupi() {

		this.setName("Skorupi");
		this.generateIVs();
		initStats();

	}

	public Skorupi(int level) {

		this.setName("Skorupi");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Skorupi(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Skorupi(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.POISON);
		this.setType2(Types.BUG);
		this.setBaseHP(40);
		this.setBaseAtk(50);
		this.setBaseDef(90);
		this.setBaseSpAtk(30);
		this.setBaseSpDef(55);
		this.setBaseSpeed(65);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
