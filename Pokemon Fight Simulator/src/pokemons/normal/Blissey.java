package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Blissey extends Chansey {

public Blissey() {
		
		this.setName("Blissey");
		this.generateIVs();
		initStats();
		
	}
	
	public Blissey(int level) {
		
		this.setName("Blissey");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Blissey(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Blissey(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(255);
		this.setBaseAtk(10);
		this.setBaseDef(10);
		this.setBaseSpAtk(75);
		this.setBaseSpDef(135);
		this.setBaseSpeed(55);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
