package pokemons.normal;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Azurill extends Pokemon {

public Azurill() {
		
		this.setName("Azurill");
		this.generateIVs();
		initStats();
		
	}
	
	public Azurill(int level) {
		
		this.setName("Azurill");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Azurill(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Azurill(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.NORMAL);
		this.setType2(Types.FAIRY);
		this.setBaseHP(50);
		this.setBaseAtk(20);
		this.setBaseDef(40);
		this.setBaseSpAtk(20);
		this.setBaseSpDef(40);
		this.setBaseSpeed(20);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
