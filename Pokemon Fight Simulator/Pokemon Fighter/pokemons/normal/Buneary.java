package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Buneary extends Pokemon {

public Buneary() {
		
		this.setName("Buneary");
		this.generateIVs();
		initStats();
		
	}
	
	public Buneary(int level) {
		
		this.setName("Buneary");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Buneary(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Buneary(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(55);
		this.setBaseAtk(66);
		this.setBaseDef(44);
		this.setBaseSpAtk(44);
		this.setBaseSpDef(56);
		this.setBaseSpeed(85);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
