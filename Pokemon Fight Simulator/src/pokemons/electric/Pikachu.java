package pokemons.electric;

import pokemons.Types;

public class Pikachu extends Pichu {
	
	public Pikachu() {
		
		this.setName("Pikachu");
		initStats();
		
	}
	
	public Pikachu(int level) {
		
		this.setName("Pikachu");
		this.setLevel(level);
		initStats();
		
	}
	
	public Pikachu(String name) {
		
		this.setName(name);
		initStats();
		
	}
	
	public Pikachu(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
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
	}
	
}
