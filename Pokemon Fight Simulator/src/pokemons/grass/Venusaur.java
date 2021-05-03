package pokemons.grass;

import pokemons.Natures;
import pokemons.Types;

public class Venusaur extends Ivysaur {

public Venusaur() {
		
		this.setName("Venusaur");
		this.generateIVs();
		initStats();
		
	}
	
	public Venusaur(int level) {
		
		this.setName("Venusaur");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Venusaur(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Venusaur(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GRASS);
		this.setType2(Types.POISON);
		this.setBaseHP(80);
		this.setBaseAtk(82);
		this.setBaseDef(83);
		this.setBaseSpAtk(100);
		this.setBaseSpDef(100);
		this.setBaseSpeed(80);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
