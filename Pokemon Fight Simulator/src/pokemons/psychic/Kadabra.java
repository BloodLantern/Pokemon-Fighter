package pokemons.psychic;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Kadabra extends Abra {

public Kadabra() {
		
		this.setName("Kadabra");
		this.generateIVs();
		initStats();
		
	}
	
	public Kadabra(int level) {
		
		this.setName("Kadabra");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Kadabra(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Kadabra(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.PSYCHIC);
		this.setBaseHP(40);
		this.setBaseAtk(35);
		this.setBaseDef(30);
		this.setBaseSpAtk(120);
		this.setBaseSpDef(70);
		this.setBaseSpeed(105);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
