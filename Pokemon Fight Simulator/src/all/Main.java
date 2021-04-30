package all;

import pokemons.Pokemon;
import pokemons.electric.Pikachu;
import pokemons.electric.Raichu;

class Main {
	
	public static void main(String[] args) {
		
		Pokemon pikachu = new Pikachu();
		Pokemon raichu = new Raichu();
		
		Fight fight = new Fight(pikachu, raichu);
		fight.begin();
		
	}
	
}
