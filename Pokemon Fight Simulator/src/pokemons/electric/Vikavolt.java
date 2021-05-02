package pokemons.electric;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Vikavolt extends Charjabug {

public Vikavolt() {
		
		this.setName("Vikavolt");
		this.generateIVs();
		initStats();
		
	}
	
	public Vikavolt(int level) {
		
		this.setName("Vikavolt");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Vikavolt(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Vikavolt(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.ELECTRIC);
		this.setType2(Types.BUG);
		this.setBaseHP(77);
		this.setBaseAtk(70);
		this.setBaseDef(90);
		this.setBaseSpAtk(145);
		this.setBaseSpDef(75);
		this.setBaseSpeed(43);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
