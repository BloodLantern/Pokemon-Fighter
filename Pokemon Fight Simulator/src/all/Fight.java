package all;

import java.util.Scanner;

import attacks.*;
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
		System.out.println(fastest(pokemon1, pokemon2).getName() + " plays first !");
		chooseAction(fastest(pokemon1, pokemon2));
		System.out.println(slowest(pokemon1, pokemon2).getName() + " plays !");
		chooseAction(slowest(pokemon1, pokemon2));
		
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
	
	private Pokemon slowest(Pokemon pokemon1, Pokemon pokemon2) {
		if (pokemon1.getSpeed() < pokemon2.getSpeed()) {
			return pokemon1;
		} else if (pokemon1.getSpeed() > pokemon2.getSpeed()) {
			return pokemon2;
		} else {
			if (Math.random()*2 < 0.5) {
				return pokemon1;
			} else {
				return pokemon2;
			}
		}
	}

	private void chooseAction(Pokemon pokemon) {
		
		System.out.println("Choose an action to do:\n1 - Attack\n2 - Switch");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		if (answer == 1) {
			
			System.out.println("Choose an attack to use:\n1 - " + pokemon.getAttacks()[0]);
			if (pokemon.getAttacksLength() > 1) {
				System.out.println("2 - " + pokemon.getAttacks()[1]);
				if (pokemon.getAttacksLength() > 2) {
					System.out.println("3 - " + pokemon.getAttacks()[2]);
					if (pokemon.getAttacksLength() > 3) {
						System.out.println("4 - " + pokemon.getAttacks()[3]);
					}
				}
			}
			
			answer = sc.nextInt();
			
			if (pokemon.getAttacks()[answer - 1].getClass().getSimpleName().equals("Attack_Physical")) {
				Attack_Physical.use((Attack_Physical)pokemon.getAttacks()[answer], pokemon, slowest(pokemon1, pokemon2));
			}
			
		}
		
		sc.close();
		
	}
}
