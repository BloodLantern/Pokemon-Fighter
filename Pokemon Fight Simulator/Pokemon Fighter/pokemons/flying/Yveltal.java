package pokemons.flying;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Yveltal extends Pokemon {

public Yveltal() {
		
		this.setName("Yveltal");
		this.generateIVs();
		initStats();
		
	}
	
	public Yveltal(int level) {
		
		this.setName("Yveltal");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Yveltal(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Yveltal(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FLYING);
		this.setType2(Types.DARK);
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
