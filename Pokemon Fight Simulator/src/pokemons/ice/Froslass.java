package pokemons.ice;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Froslass extends Pokemon {

public Froslass() {
		
		this.setName("Froslass");
		this.generateIVs();
		initStats();
		
	}
	
	public Froslass(int level) {
		
		this.setName("Froslass");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Froslass(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Froslass(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.ICE);
		this.setType2(Types.GHOST);
		this.setBaseHP(70);
		this.setBaseAtk(80);
		this.setBaseDef(70);
		this.setBaseSpAtk(80);
		this.setBaseSpDef(70);
		this.setBaseSpeed(110);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
