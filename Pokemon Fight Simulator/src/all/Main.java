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
		Pokemon ronflex = new Snorlax(100);
		Pokemon momartik = new Froslass(100);
		ronflex.describe();
		momartik.describe();
	}
	
}
