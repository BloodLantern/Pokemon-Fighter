package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Wooloo extends Pokemon {

public Wooloo() {
		
		this.setName("Wooloo");
		this.generateIVs();
		initStats();
		
	}
	
	public Wooloo(int level) {
		
		this.setName("Wooloo");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Wooloo(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Wooloo(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(42);
		this.setBaseAtk(40);
		this.setBaseDef(55);
		this.setBaseSpAtk(40);
		this.setBaseSpDef(45);
		this.setBaseSpeed(48);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
