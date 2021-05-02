package all;

import pokemons.Pokemon;
import pokemons.electric.*;
import pokemons.bug.*;
import pokemons.dark.*;
import pokemons.dragon.*;
import pokemons.fairy.*;
import pokemons.fighting.*;
import pokemons.fire.*;
import pokemons.flying.*;
import pokemons.ghost.*;
import pokemons.grass.*;
import pokemons.ground.*;
import pokemons.ice.*;
import pokemons.normal.*;
import pokemons.poison.*;
import pokemons.psychic.*;
import pokemons.rock.*;
import pokemons.steel.*;
import pokemons.water.*;
class Main {
	
	public static void main(String[] args) {
		
		Pokemon pikachu = new Pikachu("PikaPika", 30);
		Pokemon raichu = new Raichu();
		Pokemon ronflex = new Snorlax();
		System.out.println(ronflex.getSpAtk());
		System.out.println(ronflex.getSpDef());
		System.out.println(ronflex.getAtk());
		System.out.println(ronflex.getDef());
		System.out.println(ronflex.getSpeed());
		System.out.println(ronflex.getHP());
		System.out.println(ronflex.getNature());
		Fight fight = new Fight(pikachu, raichu);
		fight.begin();
		
	}
	
}
