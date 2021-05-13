package pokemons.poison;

import pokemons.Natures;
import pokemons.Types;

public class Kakuna extends Weedle {

public Kakuna() {
		
		this.setName("Kakuna");
		this.generateIVs();
		initStats();
		
	}
	
	public Kakuna(int level) {
		
		this.setName("Kakuna");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Kakuna(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Kakuna(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.POISON);
		this.setType2(Types.BUG);
		this.setBaseHP(45);
		this.setBaseAtk(25);
		this.setBaseDef(50);
		this.setBaseSpAtk(25);
		this.setBaseSpDef(25);
		this.setBaseSpeed(35);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
