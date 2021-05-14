package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Slurpuff extends Swirlix {

	public Slurpuff() {

		this.setName("Slurpuff");
		this.generateIVs();
		initStats();

	}

	public Slurpuff(int level) {

		this.setName("Slurpuff");
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	public Slurpuff(String name) {

		this.setName(name);
		this.generateIVs();
		initStats();

	}

	public Slurpuff(String name, int level) {

		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();

	}

	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(82);
		this.setBaseAtk(80);
		this.setBaseDef(86);
		this.setBaseSpAtk(85);
		this.setBaseSpDef(75);
		this.setBaseSpeed(72);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
