package pokemons.poison;

import pokemons.Natures;
import pokemons.Types;

public class Drapion extends Skorupi {

public Drapion() {
		
		this.setName("Drapion");
		this.generateIVs();
		initStats();
		
	}
	
	public Drapion(int level) {
		
		this.setName("Drapion");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Drapion(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Drapion(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.POISON);
		this.setType2(Types.DARK);
		this.setBaseHP(70);
		this.setBaseAtk(90);
		this.setBaseDef(110);
		this.setBaseSpAtk(60);
		this.setBaseSpDef(75);
		this.setBaseSpeed(95);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
