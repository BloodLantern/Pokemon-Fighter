package pokemons.poison;

import pokemons.Natures;
import pokemons.Types;

public class Beedril extends Kakuna {

	public Beedril() {

		this.setName("Beedril");
		this.generateIVs();
		initStats();

	}

	public Beedril(int level) {

		this.setName("Beedril");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Beedril(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Beedril(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.POISON);
		this.setType2(Types.BUG);
		this.setBaseHP(65);
		this.setBaseAtk(90);
		this.setBaseDef(40);
		this.setBaseSpAtk(45);
		this.setBaseSpDef(80);
		this.setBaseSpeed(75);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
