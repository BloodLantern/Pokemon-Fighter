package all;

import pokemons.Pokemon;

public class Fight {
	
	Pokemon pokemon1;
	Pokemon pokemon2;
	
	public Fight(Pokemon pokemon1, Pokemon pokemon2) {
		
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		
		System.out.println("Preparing a new fight between " + this.pokemon1.getName() + " and " + this.pokemon2.getName());
		
	}
	
	public void begin() {
		
		System.out.println("Beginning fight");
		do {
			turn();
		} while (pokemon1.getHP() > 0 || pokemon2.getHP() > 0);
	}
	
	private void turn() {
		System.out.println(fastest(pokemon1, pokemon2).getName() + " attacks first !");
		
		
	}
	
	private Pokemon fastest(Pokemon pokemon1, Pokemon pokemon2) {
		if (pokemon1.getSpeed() > pokemon2.getSpeed()) {
			return pokemon1;
		} else if (pokemon1.getSpeed() < pokemon2.getSpeed()) {
			return pokemon2;
		} else {
			if (Math.random()*2 < 0.5) {
				return pokemon1;
			} else {
				return pokemon2;
			}
		}
	}
	
}
