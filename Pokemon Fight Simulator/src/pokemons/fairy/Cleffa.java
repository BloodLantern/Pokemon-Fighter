package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Cleffa extends Pokemon {

public Cleffa() {
		
		this.setName("Cleffa");
		this.generateIVs();
		initStats();
		
	}
	
	public Cleffa(int level) {
		
		this.setName("Cleffa");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Cleffa(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Cleffa(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(50);
		this.setBaseAtk(25);
		this.setBaseDef(28);
		this.setBaseSpAtk(45);
		this.setBaseSpDef(55);
		this.setBaseSpeed(15);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
