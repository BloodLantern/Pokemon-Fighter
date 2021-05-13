package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Clefable extends Clefairy {

public Clefable() {
		
		this.setName("Clefable");
		this.generateIVs();
		initStats();
		
	}
	
	public Clefable(int level) {
		
		this.setName("Clefable");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Clefable(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Clefable(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(95);
		this.setBaseAtk(70);
		this.setBaseDef(73);
		this.setBaseSpAtk(95);
		this.setBaseSpDef(90);
		this.setBaseSpeed(60);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
