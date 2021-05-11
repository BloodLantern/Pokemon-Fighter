package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Bewear extends Stufful {

public Bewear() {
		
		this.setName("Bewear");
		this.generateIVs();
		initStats();
		
	}
	
	public Bewear(int level) {
		
		this.setName("Bewear");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Bewear(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Bewear(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setType2(Types.FIGHTING);
		this.setBaseHP(120);
		this.setBaseAtk(125);
		this.setBaseDef(80);
		this.setBaseSpAtk(55);
		this.setBaseSpDef(60);
		this.setBaseSpeed(60);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
