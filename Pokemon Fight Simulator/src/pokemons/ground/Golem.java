package pokemons.ground;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Golem extends Graveler {

public Golem() {
		
		this.setName("Golem");
		this.generateIVs();
		initStats();
		
	}
	
	public Golem(int level) {
		
		this.setName("Golem");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Golem(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Golem(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GROUND);
		this.setType2(Types.ROCK);
		this.setBaseHP(80);
		this.setBaseAtk(120);
		this.setBaseDef(130);
		this.setBaseSpAtk(55);
		this.setBaseSpDef(65);
		this.setBaseSpeed(45);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
