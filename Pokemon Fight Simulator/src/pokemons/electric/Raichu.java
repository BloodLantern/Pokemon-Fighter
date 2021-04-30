package pokemons.electric;

import pokemons.Types;

public final class Raichu extends Pikachu {
	
	public Raichu() {
		
		this.setType(Types.ELECTRIC);
		this.setName("Raichu");
		this.setBaseHP(60);
		this.setBaseAtk(90);
		this.setBaseDef(55);
		this.setBaseSpAtk(90);
		this.setBaseSpDef(80);
		this.setBaseSpeed(110);
		
	}
	
	public Raichu(int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName("Raichu");
		this.setLevel(level);
		this.setBaseHP(60);
		this.setBaseAtk(90);
		this.setBaseDef(55);
		this.setBaseSpAtk(90);
		this.setBaseSpDef(80);
		this.setBaseSpeed(110);
		
	}
	
	public Raichu(String name) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setBaseHP(60);
		this.setBaseAtk(90);
		this.setBaseDef(55);
		this.setBaseSpAtk(90);
		this.setBaseSpDef(80);
		this.setBaseSpeed(110);
		
	}
	
	public Raichu(String name, int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setLevel(level);
		this.setBaseHP(60);
		this.setBaseAtk(90);
		this.setBaseDef(55);
		this.setBaseSpAtk(90);
		this.setBaseSpDef(80);
		this.setBaseSpeed(110);
		
	}
	
}
