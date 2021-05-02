package pokemons.electric;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;
import pokemons.bug.Grubbin;

public class Charjabug extends Grubbin {

public Charjabug() {
		
		this.setName("Charjabug");
		this.generateIVs();
		initStats();
		
	}
	
	public Charjabug(int level) {
		
		this.setName("Charjabug");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Charjabug(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Charjabug(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.ELECTRIC);
		this.setType2(Types.BUG);
		this.setBaseHP(57);
		this.setBaseAtk(82);
		this.setBaseDef(95);
		this.setBaseSpAtk(55);
		this.setBaseSpDef(75);
		this.setBaseSpeed(36);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
