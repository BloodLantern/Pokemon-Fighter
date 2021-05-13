package pokemons.psychic;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Abra extends Pokemon {

public Abra() {
		
		this.setName("Abra");
		this.generateIVs();
		initStats();
		
	}
	
	public Abra(int level) {
		
		this.setName("Abra");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Abra(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Abra(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.PSYCHIC);
		this.setBaseHP(25);
		this.setBaseAtk(20);
		this.setBaseDef(15);
		this.setBaseSpAtk(105);
		this.setBaseSpDef(55);
		this.setBaseSpeed(90);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
