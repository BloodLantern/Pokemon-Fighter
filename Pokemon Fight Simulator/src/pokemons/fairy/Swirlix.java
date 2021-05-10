package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Swirlix extends Pokemon {

public Swirlix() {
		
		this.setName("Swirlix");
		this.generateIVs();
		initStats();
		
	}
	
	public Swirlix(int level) {
		
		this.setName("Swirlix");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Swirlix(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Swirlix(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(62);
		this.setBaseAtk(48);
		this.setBaseDef(66);
		this.setBaseSpAtk(59);
		this.setBaseSpDef(57);
		this.setBaseSpeed(49);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
