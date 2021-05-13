package pokemons.steel;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Magearna extends Pokemon {

public Magearna() {
		
		this.setName("Magearna");
		this.generateIVs();
		initStats();
		
	}
	
	public Magearna(int level) {
		
		this.setName("Magearna");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Magearna(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Magearna(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.STEEL);
		this.setType2(Types.FAIRY);
		this.setBaseHP(80);
		this.setBaseAtk(95);
		this.setBaseDef(115);
		this.setBaseSpAtk(130);
		this.setBaseSpDef(115);
		this.setBaseSpeed(65);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
