package pokemons.water;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;
import pokemons.normal.Eevee;

public class Vaporeon extends Eevee {

public Vaporeon() {
		
		this.setName("Vaporeon");
		this.generateIVs();
		initStats();
		
	}
	
	public Vaporeon(int level) {
		
		this.setName("Vaporeon");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Vaporeon(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Vaporeon(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setBaseHP(130);
		this.setBaseAtk(65);
		this.setBaseDef(60);
		this.setBaseSpAtk(110);
		this.setBaseSpDef(95);
		this.setBaseSpeed(65);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
