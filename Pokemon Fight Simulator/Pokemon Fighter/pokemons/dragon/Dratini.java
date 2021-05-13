package pokemons.dragon;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Dratini extends Pokemon {

public Dratini() {
		
		this.setName("Dratini");
		this.generateIVs();
		initStats();
		
	}
	
	public Dratini(int level) {
		
		this.setName("Dratini");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Dratini(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Dratini(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.DRAGON);
		this.setBaseHP(41);
		this.setBaseAtk(64);
		this.setBaseDef(45);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(50);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
