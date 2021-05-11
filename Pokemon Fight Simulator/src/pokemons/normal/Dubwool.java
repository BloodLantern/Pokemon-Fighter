package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Dubwool extends Wooloo {

public Dubwool() {
		
		this.setName("Dubwool");
		this.generateIVs();
		initStats();
		
	}
	
	public Dubwool(int level) {
		
		this.setName("Dubwool");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Dubwool(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Dubwool(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(72);
		this.setBaseAtk(80);
		this.setBaseDef(100);
		this.setBaseSpAtk(60);
		this.setBaseSpDef(90);
		this.setBaseSpeed(88);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
