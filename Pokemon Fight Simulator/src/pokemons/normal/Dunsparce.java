package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Dunsparce extends Pokemon {

public Dunsparce() {
		
		this.setName("Dunsparce");
		this.generateIVs();
		initStats();
		
	}
	
	public Dunsparce(int level) {
		
		this.setName("Dunsparce");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Dunsparce(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Dunsparce(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(100);
		this.setBaseAtk(70);
		this.setBaseDef(70);
		this.setBaseSpAtk(65);
		this.setBaseSpDef(65);
		this.setBaseSpeed(45);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
