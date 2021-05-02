package pokemons.bug;

import pokemons.Pokemon;
import pokemons.Types;

public class Weedle extends Pokemon {

public Weedle() {
		
		this.setName("Weedle");
		this.generateIVs();
		initStats();
		
	}
	
	public Weedle(int level) {
		
		this.setName("Weedle");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Weedle(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Weedle(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.BUG);
		this.setBaseHP(40);
		this.setBaseAtk(35);
		this.setBaseDef(30);
		this.setBaseSpAtk(20);
		this.setBaseSpDef(20);
		this.setBaseSpeed(50);
	}

}
