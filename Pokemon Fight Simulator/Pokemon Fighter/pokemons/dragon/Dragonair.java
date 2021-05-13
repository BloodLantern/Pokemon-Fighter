package pokemons.dragon;

import pokemons.Natures;
import pokemons.Types;

public class Dragonair extends Dratini {

public Dragonair() {
		
		this.setName("Dragonair");
		this.generateIVs();
		initStats();
		
	}
	
	public Dragonair(int level) {
		
		this.setName("Dragonair");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Dragonair(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Dragonair(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.DRAGON);
		this.setBaseHP(61);
		this.setBaseAtk(84);
		this.setBaseDef(65);
		this.setBaseSpAtk(70);
		this.setBaseSpDef(70);
		this.setBaseSpeed(70);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
