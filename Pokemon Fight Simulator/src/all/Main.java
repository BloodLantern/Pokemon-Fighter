package all;

import attacks.Attack_Physical;
import attacks.Attack_Special;
import io.Add_Pokemon;
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
		/*Pokemon ty = new Tyranitar(100);
		Pokemon dr = new Dragonite(100);
		ty.addAttack(Attack_Physical.DARKEST_LARIAT);
		ty.addAttack(Attack_Physical.ROCK_SLIDE);
		ty.addAttack(Attack_Physical.EARTHQUAKE);
		ty.addAttack(Attack_Physical.ICE_PUNCH);
		dr.addAttack(Attack_Physical.ACROBATICS);
		dr.addAttack(Attack_Physical.EARTHQUAKE);
		dr.addAttack(Attack_Physical.BODY_SLAM);
		dr.addAttack(Attack_Physical.DRAGON_CLAW);
		Fight f = new Fight(ty, dr);
		f.begin();*/
		Add_Pokemon.generate();
	}
	
}
