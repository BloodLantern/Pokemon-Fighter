package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Snorlax extends Munchlax {

public Snorlax() {
		
		this.setName("Snorlax");
		this.generateIVs();
		initStats();
		
	}
	
	public Snorlax(int level) {
		
		this.setName("Snorlax");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Snorlax(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Snorlax(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(160);
		this.setBaseAtk(110);
		this.setBaseDef(65);
		this.setBaseSpAtk(65);
		this.setBaseSpDef(110);
		this.setBaseSpeed(30);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
