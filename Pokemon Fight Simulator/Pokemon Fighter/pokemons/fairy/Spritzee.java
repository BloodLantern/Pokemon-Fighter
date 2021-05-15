package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Spritzee extends Pokemon {

	public Spritzee() {

		this.setName("Spritzee");
		this.generateIVs();
		initStats();

	}

	public Spritzee(int level) {

		this.setName("Spritzee");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Spritzee(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Spritzee(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(78);
		this.setBaseAtk(52);
		this.setBaseDef(60);
		this.setBaseSpAtk(63);
		this.setBaseSpDef(65);
		this.setBaseSpeed(23);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
