package pokemons.bug;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Grubbin extends Pokemon {

public Grubbin() {
		
		this.setName("Grubbin");
		this.generateIVs();
		initStats();
		
	}
	
	public Grubbin(int level) {
		
		this.setName("Grubbin");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Grubbin(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Grubbin(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.BUG);
		this.setBaseHP(47);
		this.setBaseAtk(62);
		this.setBaseDef(45);
		this.setBaseSpAtk(55);
		this.setBaseSpDef(45);
		this.setBaseSpeed(46);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
