package pokemons.flying;

import pokemons.Natures;
import pokemons.Types;

public class Togekiss extends Togetic {

public Togekiss() {
		
		this.setName("Togekiss");
		this.generateIVs();
		initStats();
		
	}
	
	public Togekiss(int level) {
		
		this.setName("Togekiss");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Togekiss(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Togekiss(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FLYING);
		this.setType2(Types.FAIRY);
		this.setBaseHP(85);
		this.setBaseAtk(50);
		this.setBaseDef(95);
		this.setBaseSpAtk(120);
		this.setBaseSpDef(115);
		this.setBaseSpeed(80);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
