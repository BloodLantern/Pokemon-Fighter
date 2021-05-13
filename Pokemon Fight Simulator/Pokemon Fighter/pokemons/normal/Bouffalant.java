package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Bouffalant extends Pokemon {

public Bouffalant() {
		
		this.setName("Bouffalant");
		this.generateIVs();
		initStats();
		
	}
	
	public Bouffalant(int level) {
		
		this.setName("Bouffalant");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Bouffalant(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Bouffalant(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(95);
		this.setBaseAtk(110);
		this.setBaseDef(95);
		this.setBaseSpAtk(40);
		this.setBaseSpDef(95);
		this.setBaseSpeed(55);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
