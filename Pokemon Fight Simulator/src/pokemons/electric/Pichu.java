package pokemons.electric;

import pokemons.Pokemon;
import pokemons.Types;

public class Pichu extends Pokemon {
	
	public Pichu() {
		
		this.setType(Types.ELECTRIC);
		this.setName("Pichu");
		this.setBaseHP(20);
		this.setBaseAtk(40);
		this.setBaseDef(15);
		this.setBaseSpAtk(35);
		this.setBaseSpDef(35);
		this.setBaseSpeed(60);
		
	}
	
	public Pichu(int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName("Pichu");
		this.setLevel(level);
		this.setBaseHP(20);
		this.setBaseAtk(40);
		this.setBaseDef(15);
		this.setBaseSpAtk(35);
		this.setBaseSpDef(35);
		this.setBaseSpeed(60);
		
	}
	
	public Pichu(String name) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setBaseHP(20);
		this.setBaseAtk(40);
		this.setBaseDef(15);
		this.setBaseSpAtk(35);
		this.setBaseSpDef(35);
		this.setBaseSpeed(60);
		
	}
	
	public Pichu(String name, int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setLevel(level);
		this.setBaseHP(20);
		this.setBaseAtk(40);
		this.setBaseDef(15);
		this.setBaseSpAtk(35);
		this.setBaseSpDef(35);
		this.setBaseSpeed(60);
		
	}
	
}
