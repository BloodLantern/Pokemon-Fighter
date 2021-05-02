package pokemons.water;

import pokemons.Pokemon;
import pokemons.Types;

public class Urshifu_Water extends Pokemon {

public Urshifu_Water() {
		
		this.setName("Urshifu");
		this.generateIVs();
		initStats();
		
	}
	
	public Urshifu_Water(int level) {
		
		this.setName("Urshifu");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Urshifu_Water(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Urshifu_Water(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.WATER);
		this.setType2(Types.FIGHTING);
		this.setBaseHP(100);
		this.setBaseAtk(130);
		this.setBaseDef(100);
		this.setBaseSpAtk(63);
		this.setBaseSpDef(60);
		this.setBaseSpeed(97);
	}

}
