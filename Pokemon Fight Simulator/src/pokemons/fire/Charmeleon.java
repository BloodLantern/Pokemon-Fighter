package pokemons.fire;

import pokemons.Natures;
import pokemons.Types;

public class Charmeleon extends Charmander {

public Charmeleon() {
		
		this.setName("Charmeleon");
		this.generateIVs();
		initStats();
		
	}
	
	public Charmeleon(int level) {
		
		this.setName("Charmeleon");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Charmeleon(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Charmeleon(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FIRE);
		this.setBaseHP(58);
		this.setBaseAtk(64);
		this.setBaseDef(58);
		this.setBaseSpAtk(80);
		this.setBaseSpDef(65);
		this.setBaseSpeed(80);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
