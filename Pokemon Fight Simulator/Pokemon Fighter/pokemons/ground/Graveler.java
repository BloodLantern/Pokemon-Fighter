package pokemons.ground;

import pokemons.Natures;
import pokemons.Types;

public class Graveler extends Geodude {

public Graveler() {
		
		this.setName("Graveler");
		this.generateIVs();
		initStats();
		
	}
	
	public Graveler(int level) {
		
		this.setName("Graveler");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Graveler(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Graveler(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GROUND);
		this.setType2(Types.ROCK);
		this.setBaseHP(55);
		this.setBaseAtk(95);
		this.setBaseDef(115);
		this.setBaseSpAtk(45);
		this.setBaseSpDef(45);
		this.setBaseSpeed(35);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
