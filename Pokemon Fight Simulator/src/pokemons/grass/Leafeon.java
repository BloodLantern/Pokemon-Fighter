package pokemons.grass;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;
import pokemons.normal.Eevee;

public class Leafeon extends Eevee {

public Leafeon() {
		
		this.setName("Leafeon");
		this.generateIVs();
		initStats();
		
	}
	
	public Leafeon(int level) {
		
		this.setName("Leafeon");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Leafeon(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Leafeon(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GRASS);
		this.setBaseHP(65);
		this.setBaseAtk(110);
		this.setBaseDef(130);
		this.setBaseSpAtk(60);
		this.setBaseSpDef(65);
		this.setBaseSpeed(95);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
