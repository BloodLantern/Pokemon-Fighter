package pokemons.fire;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;
import pokemons.normal.Eevee;

public class Flareon extends Eevee {

public Flareon() {
		
		this.setName("Flareon");
		this.generateIVs();
		initStats();
		
	}
	
	public Flareon(int level) {
		
		this.setName("Flareon");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Flareon(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Flareon(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FIRE);
		this.setBaseHP(65);
		this.setBaseAtk(130);
		this.setBaseDef(60);
		this.setBaseSpAtk(95);
		this.setBaseSpDef(110);
		this.setBaseSpeed(65);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
