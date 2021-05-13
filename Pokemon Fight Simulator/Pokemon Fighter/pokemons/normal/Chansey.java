package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Chansey extends Happiny {

public Chansey() {
		
		this.setName("Chansey");
		this.generateIVs();
		initStats();
		
	}
	
	public Chansey(int level) {
		
		this.setName("Chansey");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Chansey(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Chansey(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(250);
		this.setBaseAtk(5);
		this.setBaseDef(5);
		this.setBaseSpAtk(35);
		this.setBaseSpDef(105);
		this.setBaseSpeed(50);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
