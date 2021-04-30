package pokemons.electric;

import pokemons.Types;

public class Pikachu extends Pichu {
	
	public Pikachu() {
		
		this.setType(Types.ELECTRIC);
		this.setName("Pikachu");
		this.setBaseHP(35);
		this.setBaseAtk(55);
		this.setBaseDef(40);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(90);
		
	}
	
	public Pikachu(int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName("Pikachu");
		this.setLevel(level);
		this.setBaseHP(35);
		this.setBaseAtk(55);
		this.setBaseDef(40);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(90);
		
	}
	
	public Pikachu(String name) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setBaseHP(35);
		this.setBaseAtk(55);
		this.setBaseDef(40);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(90);
		
	}
	
	public Pikachu(String name, int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setLevel(level);
		this.setBaseHP(35);
		this.setBaseAtk(55);
		this.setBaseDef(40);
		this.setBaseSpAtk(50);
		this.setBaseSpDef(50);
		this.setBaseSpeed(90);
		
	}
	
}
