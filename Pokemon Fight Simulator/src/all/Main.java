package all;

import pokemons.Natures;
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
@SuppressWarnings("unused")

class Main {
	
	public static void main(String[] args) {
		
		Pokemon pikachu = new Pikachu("PikaPika", 30);
		Pokemon raichu = new Raichu();
		Pokemon ronflex = new Snorlax(100);
		System.out.println(ronflex.getHP() + "\n" + ronflex.getAtk() + "\n" + ronflex.getDef() + "\n" + ronflex.getSpAtk() + "\n" + ronflex.getSpDef() + "\n" + ronflex.getSpeed() + "\n" + ronflex.getNature() + "\n" + ronflex.getType() + "\n" + ronflex.getType2() + "\n" + ronflex.getName());
		//Fight fight = new Fight(pikachu, raichu);
		//fight.begin();
		
	}
	
}
