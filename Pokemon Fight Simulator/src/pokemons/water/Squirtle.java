package pokemons.water;

import pokemons.Pokemon;
import pokemons.Types;

public class Squirtle extends Pokemon {

public Squirtle() {
		
		this.setName("Squirtle");
		this.generateIVs();
		initStats();
		
	}
	
	public Squirtle(int level) {
		
		this.setName("Squirtle");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Squirtle(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Squirtle(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setBaseHP(44);
		this.setBaseAtk(48);
		this.setBaseDef(65);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(64);
		this.setBaseSpeed(43);
	}

}
