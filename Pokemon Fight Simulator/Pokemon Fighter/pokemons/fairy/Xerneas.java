package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Xerneas extends Pokemon {

public Xerneas() {
		
		this.setName("Xerneas");
		this.generateIVs();
		initStats();
		
	}
	
	public Xerneas(int level) {
		
		this.setName("Xerneas");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Xerneas(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Xerneas(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(126);
		this.setBaseAtk(131);
		this.setBaseDef(95);
		this.setBaseSpAtk(131);
		this.setBaseSpDef(98);
		this.setBaseSpeed(99);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
