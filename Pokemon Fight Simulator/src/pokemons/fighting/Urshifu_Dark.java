package pokemons.fighting;

import pokemons.Pokemon;
import pokemons.Types;

public class Urshifu_Dark extends Pokemon {

public Urshifu_Dark() {
		
		this.setName("Urshifu");
		this.generateIVs();
		initStats();
		
	}
	
	public Urshifu_Dark(int level) {
		
		this.setName("Urshifu");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Urshifu_Dark(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Urshifu_Dark(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FIGHTING);
		this.setType2(Types.DARK);
		this.setBaseHP(100);
		this.setBaseAtk(130);
		this.setBaseDef(100);
		this.setBaseSpAtk(63);
		this.setBaseSpDef(60);
		this.setBaseSpeed(97);
	}
}
