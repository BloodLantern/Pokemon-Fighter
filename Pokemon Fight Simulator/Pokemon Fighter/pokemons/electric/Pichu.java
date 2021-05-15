package pokemons.electric;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Pichu extends Pokemon {

	public Pichu() {

		this.setName("Pichu");
		this.generateIVs();
		initStats();

	}

	public Pichu(int level) {

		this.setName("Pichu");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Pichu(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Pichu(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.ELECTRIC);
		this.setBaseHP(20);
		this.setBaseAtk(40);
		this.setBaseDef(15);
		this.setBaseSpAtk(35);
		this.setBaseSpDef(35);
		this.setBaseSpeed(60);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
