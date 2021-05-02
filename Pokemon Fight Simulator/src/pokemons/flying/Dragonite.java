package pokemons.flying;

import pokemons.Pokemon;
import pokemons.Types;

public class Dragonite extends Pokemon {

public Dragonite() {
		
		this.setName("Dragonite");
		this.generateIVs();
		initStats();
		
	}
	
	public Dragonite(int level) {
		
		this.setName("Dragonite");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Dragonite(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Dragonite(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FLYING);
		this.setType2(Types.DRAGON);
		this.setBaseHP(91);
		this.setBaseAtk(134);
		this.setBaseDef(95);
		this.setBaseSpAtk(100);
		this.setBaseSpDef(100);
		this.setBaseSpeed(80);
	}

}
