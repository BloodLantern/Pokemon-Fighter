package pokemons.water;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Politoed extends Poliwhirl {

public Politoed() {
		
		this.setName("Politoed");
		this.generateIVs();
		initStats();
		
	}
	
	public Politoed(int level) {
		
		this.setName("Politoed");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Politoed(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Politoed(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setBaseHP(90);
		this.setBaseAtk(75);
		this.setBaseDef(75);
		this.setBaseSpAtk(90);
		this.setBaseSpDef(100);
		this.setBaseSpeed(70);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
