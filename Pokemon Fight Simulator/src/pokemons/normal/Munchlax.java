package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Munchlax extends Pokemon {

public Munchlax() {
		
		this.setName("Munchlax");
		this.generateIVs();
		initStats();
		
	}
	
	public Munchlax(int level) {
		
		this.setName("Munchlax");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Munchlax(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Munchlax(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(135);
		this.setBaseAtk(85);
		this.setBaseDef(40);
		this.setBaseSpAtk(40);
		this.setBaseSpDef(85);
		this.setBaseSpeed(5);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
