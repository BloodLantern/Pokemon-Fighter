package pokemons.electric;

import pokemons.Natures;
import pokemons.Types;

public class Pikachu extends Pichu {
	
	public Pikachu() {
		
		this.setName("Pikachu");
		this.generateIVs();
		initStats();
		
	}
	
	public Pikachu(int level) {
		
		this.setName("Pikachu");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Pikachu(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Pikachu(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.ELECTRIC);
		this.setBaseHP(35);
		this.setBaseAtk(55);
		this.setBaseDef(40);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(90);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
	
}
