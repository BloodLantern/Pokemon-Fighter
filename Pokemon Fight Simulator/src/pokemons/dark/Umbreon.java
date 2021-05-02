package pokemons.dark;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Umbreon extends Pokemon {

public Umbreon() {
		
		this.setName("Umbreon");
		this.generateIVs();
		initStats();
		
	}
	
	public Umbreon(int level) {
		
		this.setName("Umbreon");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Umbreon(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Umbreon(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.DARK);
		this.setBaseHP(95);
		this.setBaseAtk(65);
		this.setBaseDef(110);
		this.setBaseSpAtk(60);
		this.setBaseSpDef(130);
		this.setBaseSpeed(65);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
