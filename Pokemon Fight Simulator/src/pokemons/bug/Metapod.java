package pokemons.bug;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Metapod extends Caterpie {

public Metapod() {
		
		this.setName("Metapod");
		this.generateIVs();
		initStats();
		
	}
	
	public Metapod(int level) {
		
		this.setName("Metapod");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Metapod(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Metapod(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.BUG);
		this.setBaseHP(50);
		this.setBaseAtk(20);
		this.setBaseDef(55);
		this.setBaseSpAtk(25);
		this.setBaseSpDef(25);
		this.setBaseSpeed(30);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
