package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Happiny extends Pokemon {

public Happiny() {
		
		this.setName("Happiny");
		this.generateIVs();
		initStats();
		
	}
	
	public Happiny(int level) {
		
		this.setName("Happiny");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Happiny(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Happiny(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(100);
		this.setBaseAtk(5);
		this.setBaseDef(5);
		this.setBaseSpAtk(15);
		this.setBaseSpDef(65);
		this.setBaseSpeed(30);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
