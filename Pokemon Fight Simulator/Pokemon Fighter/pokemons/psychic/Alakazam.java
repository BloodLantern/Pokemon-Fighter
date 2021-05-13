package pokemons.psychic;

import pokemons.Natures;
import pokemons.Types;

public class Alakazam extends Kadabra {

public Alakazam() {
		
		this.setName("Alakazam");
		this.generateIVs();
		initStats();
		
	}
	
	public Alakazam(int level) {
		
		this.setName("Alakazam");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Alakazam(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Alakazam(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.PSYCHIC);
		this.setBaseHP(55);
		this.setBaseAtk(50);
		this.setBaseDef(45);
		this.setBaseSpAtk(135);
		this.setBaseSpDef(95);
		this.setBaseSpeed(120);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
