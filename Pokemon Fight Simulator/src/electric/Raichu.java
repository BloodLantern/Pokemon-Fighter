package electric;

import pokemons.Types;

public final class Raichu extends Pikachu {
	
	public Raichu() {
		
		this.setType(Types.ELECTRIC);
		this.setName("Raichu");
		this.setHP(60);
		this.setAtk(90);
		this.setDef(55);
		this.setSpAtk(90);
		this.setSpDef(80);
		this.setSpeed(110);
		
	}
	
	public Raichu(int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName("Raichu");
		this.setLevel(level);
		this.setHP(60);
		this.setAtk(90);
		this.setDef(55);
		this.setSpAtk(90);
		this.setSpDef(80);
		this.setSpeed(110);
		
	}
	
	public Raichu(String name) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setHP(60);
		this.setAtk(90);
		this.setDef(55);
		this.setSpAtk(90);
		this.setSpDef(80);
		this.setSpeed(110);
		
	}
	
	public Raichu(String name, int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setLevel(level);
		this.setHP(60);
		this.setAtk(90);
		this.setDef(55);
		this.setSpAtk(90);
		this.setSpDef(80);
		this.setSpeed(110);
		
	}
	
}
