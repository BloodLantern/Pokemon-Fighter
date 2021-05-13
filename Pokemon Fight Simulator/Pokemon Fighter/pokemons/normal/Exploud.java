package pokemons.normal;

import pokemons.Natures;
import pokemons.Types;

public class Exploud extends Loudred {

public Exploud() {
		
		this.setName("Exploud");
		this.generateIVs();
		initStats();
		
	}
	
	public Exploud(int level) {
		
		this.setName("Exploud");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Exploud(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Exploud(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setBaseHP(104);
		this.setBaseAtk(91);
		this.setBaseDef(63);
		this.setBaseSpAtk(91);
		this.setBaseSpDef(73);
		this.setBaseSpeed(68);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
