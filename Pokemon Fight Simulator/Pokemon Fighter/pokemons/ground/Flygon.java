package pokemons.ground;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Flygon extends Vibrava {

public Flygon() {
		
		this.setName("Flygon");
		this.generateIVs();
		initStats();
		
	}
	
	public Flygon(int level) {
		
		this.setName("Flygon");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Flygon(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Flygon(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GROUND);
		this.setType2(Types.DRAGON);
		this.setBaseHP(80);
		this.setBaseAtk(100);
		this.setBaseDef(80);
		this.setBaseSpAtk(80);
		this.setBaseSpDef(80);
		this.setBaseSpeed(100);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
