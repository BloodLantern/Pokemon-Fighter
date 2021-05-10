package pokemons.ground;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Vibrava extends Trapinch {

public Vibrava() {
		
		this.setName("Vibrava");
		this.generateIVs();
		initStats();
		
	}
	
	public Vibrava(int level) {
		
		this.setName("Vibrava");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Vibrava(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Vibrava(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GROUND);
		this.setType2(Types.DRAGON);
		this.setBaseHP(50);
		this.setBaseAtk(70);
		this.setBaseDef(50);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(70);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
