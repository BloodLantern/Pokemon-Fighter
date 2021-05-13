package pokemons.ice;

import pokemons.Natures;
import pokemons.Types;

public class Glalie extends Snorunt {

public Glalie() {
		
		this.setName("Glalie");
		this.generateIVs();
		initStats();
		
	}
	
	public Glalie(int level) {
		
		this.setName("Glalie");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Glalie(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Glalie(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.ICE);
		this.setType2(Types.GHOST);
		this.setBaseHP(80);
		this.setBaseAtk(80);
		this.setBaseDef(80);
		this.setBaseSpAtk(80);
		this.setBaseSpDef(80);
		this.setBaseSpeed(80);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
