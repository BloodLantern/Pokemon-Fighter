package pokemons.rock;

import pokemons.Pokemon;
import pokemons.Types;

public class Tyranitar extends Pokemon {

public Tyranitar() {
		
		this.setName("Tyranitar");
		this.generateIVs();
		initStats();
		
	}
	
	public Tyranitar(int level) {
		
		this.setName("Tyranitar");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Tyranitar(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Tyranitar(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.ROCK);
		this.setType2(Types.DARK);
		this.setBaseHP(100);
		this.setBaseAtk(134);
		this.setBaseDef(110);
		this.setBaseSpAtk(95);
		this.setBaseSpDef(100);
		this.setBaseSpeed(61);
	}

}
