package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Minccino extends Pokemon {

public Minccino() {
		
		this.setName("Minccino");
		this.generateIVs();
		initStats();
		
	}
	
	public Minccino(int level) {
		
		this.setName("Minccino");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Minccino(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Minccino(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(55);
		this.setBaseAtk(50);
		this.setBaseDef(40);
		this.setBaseSpAtk(40);
		this.setBaseSpDef(40);
		this.setBaseSpeed(75);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
