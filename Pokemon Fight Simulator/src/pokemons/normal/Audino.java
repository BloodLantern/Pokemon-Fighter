package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Audino extends Pokemon {

public Audino() {
		
		this.setName("Audino");
		this.generateIVs();
		initStats();
		
	}
	
	public Audino(int level) {
		
		this.setName("Audino");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Audino(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Audino(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(103);
		this.setBaseAtk(60);
		this.setBaseDef(86);
		this.setBaseSpAtk(60);
		this.setBaseSpDef(86);
		this.setBaseSpeed(50);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
