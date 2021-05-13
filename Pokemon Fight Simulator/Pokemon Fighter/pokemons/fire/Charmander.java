package pokemons.fire;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Charmander extends Pokemon {

public Charmander() {
		
		this.setName("Charmander");
		this.generateIVs();
		initStats();
		
	}
	
	public Charmander(int level) {
		
		this.setName("Charmander");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Charmander(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Charmander(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FIRE);
		this.setBaseHP(39);
		this.setBaseAtk(52);
		this.setBaseDef(43);
		this.setBaseSpAtk(60);
		this.setBaseSpDef(50);
		this.setBaseSpeed(65);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
