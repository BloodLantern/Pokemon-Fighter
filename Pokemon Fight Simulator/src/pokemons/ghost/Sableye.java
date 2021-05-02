package pokemons.ghost;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Sableye extends Pokemon {

public Sableye() {
		
		this.setName("Sableye");
		this.generateIVs();
		initStats();
		
	}
	
	public Sableye(int level) {
		
		this.setName("Sableye");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Sableye(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Sableye(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GHOST);
		this.setType2(Types.DARK);
		this.setBaseHP(50);
		this.setBaseAtk(75);
		this.setBaseDef(75);
		this.setBaseSpAtk(65);
		this.setBaseSpDef(65);
		this.setBaseSpeed(50);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
