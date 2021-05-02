package pokemons.grass;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Ivysaur extends Bulbasaur {

public Ivysaur() {
		
		this.setName("Ivysaur");
		this.generateIVs();
		initStats();
		
	}
	
	public Ivysaur(int level) {
		
		this.setName("Ivysaur");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Ivysaur(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Ivysaur(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GRASS);
		this.setType2(Types.POISON);
		this.setBaseHP(60);
		this.setBaseAtk(62);
		this.setBaseDef(63);
		this.setBaseSpAtk(80);
		this.setBaseSpDef(80);
		this.setBaseSpeed(60);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
