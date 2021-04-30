package pokemons.electric;

import pokemons.Pokemon;
import pokemons.Types;

public class Pichu extends Pokemon {
	
	public Pichu() {
		
		this.setType(Types.ELECTRIC);
		this.setName("Pichu");
		this.setHP(20);
		this.setAtk(40);
		this.setDef(15);
		this.setSpAtk(35);
		this.setSpDef(35);
		this.setSpeed(60);
		
	}
	
	public Pichu(int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName("Pichu");
		this.setLevel(level);
		this.setHP(20);
		this.setAtk(40);
		this.setDef(15);
		this.setSpAtk(35);
		this.setSpDef(35);
		this.setSpeed(60);
		
	}
	
	public Pichu(String name) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setHP(20);
		this.setAtk(40);
		this.setDef(15);
		this.setSpAtk(35);
		this.setSpDef(35);
		this.setSpeed(60);
		
	}
	
	public Pichu(String name, int level) {
		
		this.setType(Types.ELECTRIC);
		this.setName(name);
		this.setLevel(level);
		this.setHP(20);
		this.setAtk(40);
		this.setDef(15);
		this.setSpAtk(35);
		this.setSpDef(35);
		this.setSpeed(60);
		
	}
	
}
