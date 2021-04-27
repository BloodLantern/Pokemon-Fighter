package electric;

import pokemons.Types;

public class Pikachu extends Pichu {
	
	public Pikachu() {
		
		this.setType(Types.ELECTRIC);
		this.setName("Pikachu");
		this.setHP(35);
		this.setAtk(55);
		this.setDef(40);
		this.setSpAtk(50);
		this.setSpDef(50);
		this.setSpeed(90);
		
	}
	
	public Pikachu(int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName("Pikachu");
		this.setLevel(level);
		this.setHP(35);
		this.setAtk(55);
		this.setDef(40);
		this.setSpAtk(50);
		this.setSpDef(50);
		this.setSpeed(90);
		
	}
	
	public Pikachu(String name) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setHP(35);
		this.setAtk(55);
		this.setDef(40);
		this.setSpAtk(50);
		this.setSpDef(50);
		this.setSpeed(90);
		
	}
	
	public Pikachu(String name, int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setLevel(level);
		this.setHP(35);
		this.setAtk(55);
		this.setDef(40);
		this.setSpAtk(50);
		this.setSpDef(50);
		this.setSpeed(90);
		
	}
	
}
