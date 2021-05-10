package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Acromatisse extends Spritzee {

public Acromatisse() {
		
		this.setName("Acromatisse");
		this.generateIVs();
		initStats();
		
	}
	
	public Acromatisse(int level) {
		
		this.setName("Acromatisse");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Acromatisse(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Acromatisse(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(101);
		this.setBaseAtk(72);
		this.setBaseDef(72);
		this.setBaseSpAtk(99);
		this.setBaseSpDef(89);
		this.setBaseSpeed(29);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
