package pokemons.ground;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Trapinch extends Pokemon {

public Trapinch() {
		
		this.setName("Trapinch");
		this.generateIVs();
		initStats();
		
	}
	
	public Trapinch(int level) {
		
		this.setName("Trapinch");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Trapinch(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Trapinch(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GROUND);
		this.setBaseHP(45);
		this.setBaseAtk(100);
		this.setBaseDef(45);
		this.setBaseSpAtk(45);
		this.setBaseSpDef(45);
		this.setBaseSpeed(10);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
