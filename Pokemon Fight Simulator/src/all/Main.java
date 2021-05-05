package all;

import attacks.Attack_Physical;
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
		Pokemon ronflex = new Froslass(100);
		Pokemon pika = new Raichu(100);
		pika.addAttack(Attack_Physical.BOLT_BEAK);
		pika.addAttack(Attack_Physical.BOLT_STRIKE);
		pika.addAttack(Attack_Physical.FUSION_BOLT);
		pika.addAttack(Attack_Physical.WILD_CHARGE);
		ronflex.addAttack(Attack_Physical.BOLT_BEAK);
		Fight f = new Fight(ronflex, pika);
		f.begin();
	}
	
}
