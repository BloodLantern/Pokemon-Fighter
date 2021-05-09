package all;

import java.awt.EventQueue;

import attacks.Attack_Physical;
import attacks.Attack_Special;
import gui.AddPokemonWindow;
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
		createAddPokemonWindow();
	}
	
	private static void createAddPokemonWindow() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					AddPokemonWindow window = new AddPokemonWindow();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void createFight() {
		Pokemon go = new Golem(100);
		Pokemon al = new Alakazam(100);
		Pokemon ty = new Tyranitar(100);
		go.addAttack(Attack_Physical.EARTHQUAKE);
		go.addAttack(Attack_Physical.STONE_EDGE);
		go.addAttack(Attack_Physical.BODY_SLAM);
		go.addAttack(Attack_Physical.KNOCK_OFF);
		al.addAttack(Attack_Special.FOCUS_BLAST);
		al.addAttack(Attack_Special.PSYCHIC);
		al.addAttack(Attack_Special.SHADOW_BALL);
		al.addAttack(Attack_Special.ENERGY_BALL);
		ty.addAttack(Attack_Physical.EARTHQUAKE);
		ty.addAttack(Attack_Physical.KNOCK_OFF);
		ty.addAttack(Attack_Physical.STONE_EDGE);
		ty.addAttack(Attack_Physical.ICE_PUNCH);
		Fight f = new Fight(al, ty);
		f.begin();
	}
	
}
