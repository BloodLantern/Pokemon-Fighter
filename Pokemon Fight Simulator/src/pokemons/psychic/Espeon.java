package pokemons.psychic;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;
import pokemons.normal.Eevee;

public class Espeon extends Eevee {

public Espeon() {
		
		this.setName("Espeon");
		this.generateIVs();
		initStats();
		
	}
	
	public Espeon(int level) {
		
		this.setName("Espeon");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Espeon(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Espeon(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.PSYCHIC);
		this.setBaseHP(65);
		this.setBaseAtk(65);
		this.setBaseDef(60);
		this.setBaseSpAtk(130);
		this.setBaseSpDef(95);
		this.setBaseSpeed(110);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
