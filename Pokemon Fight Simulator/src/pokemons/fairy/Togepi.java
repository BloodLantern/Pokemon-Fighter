package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Togepi extends Pokemon {

public Togepi() {
		
		this.setName("Togepi");
		this.generateIVs();
		initStats();
		
	}
	
	public Togepi(int level) {
		
		this.setName("Togepi");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Togepi(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Togepi(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(35);
		this.setBaseAtk(20);
		this.setBaseDef(65);
		this.setBaseSpAtk(40);
		this.setBaseSpDef(65);
		this.setBaseSpeed(20);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
