package all;

import java.util.Scanner;

import attacks.*;
import pokemons.Pokemon;

public class Fight {

	Pokemon pokemon1;
	Pokemon pokemon2;
	Pokemon fastest;
	Pokemon slowest;
	Scanner sc = new Scanner(System.in);

	public Fight(Pokemon pokemon1, Pokemon pokemon2) {

		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;

		System.out.println(
				"Preparing a new fight between " + this.pokemon1.getName() + " and " + this.pokemon2.getName());

	}

	public void begin() {

		System.out.println("Beginning fight");
		do {
			fastest(pokemon1, pokemon2);
			turn(this.fastest);
			if (pokemon1.getHP() > 0 && pokemon2.getHP() > 0)
				turn(this.slowest);
		} while (pokemon1.getHP() > 0 && pokemon2.getHP() > 0);

		if (pokemon1.getHP() <= 0) {
			System.out.println(pokemon1.getName() + " died.\n" + pokemon2.getName() + " won the fight !");
		} else {
			System.out.println(pokemon2.getName() + " died.\n" + pokemon1.getName() + " won the fight !");
		}
		sc.close();
	}

	private void turn(Pokemon pokemon) {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (pokemon.equals(fastest)) {
			System.out.println(pokemon.getName() + " plays first !");
		} else {
			System.out.println(pokemon.getName() + " plays !");
		}
		chooseAction(pokemon);
	}

	private void fastest(Pokemon pokemon1, Pokemon pokemon2) {
		if (pokemon1.getSpeed() > pokemon2.getSpeed()) {
			this.fastest = pokemon1;
			this.slowest = pokemon2;
		} else if (pokemon1.getSpeed() < pokemon2.getSpeed()) {
			this.fastest = pokemon2;
			this.slowest = pokemon1;
		} else {
			if (Math.random() * 2 < 0.5) {
				this.fastest = pokemon1;
				this.slowest = pokemon2;
			} else {
				this.fastest = pokemon2;
				this.slowest = pokemon1;
			}
		}
	}

	private void chooseAction(Pokemon pokemon) {

		System.out.println("Choose an action to do:\n1 - Attack\n2 - Switch");
		int answer = sc.nextInt();
		if (answer == 1) {

			System.out.println("Choose an attack to use:\n1 - " + (pokemon.getAttacks()[0]).getTextName());
			if (pokemon.getAttacksLength() > 1) {
				System.out.println("2 - " + (pokemon.getAttacks()[1]).getTextName());
				if (pokemon.getAttacksLength() > 2) {
					System.out.println("3 - " + (pokemon.getAttacks()[2]).getTextName());
					if (pokemon.getAttacksLength() > 3) {
						System.out.println("4 - " + (pokemon.getAttacks()[3]).getTextName());
					}
				}
			}

			answer = sc.nextInt();

			if (pokemon.equals(this.fastest)) {

				int HPBefore = this.slowest.getHP();

				if (pokemon.getAttacks()[answer - 1].getClass().getSimpleName().equals("Attack_Physical")) {
					if (Attack_Physical.use((Attack_Physical) pokemon.getAttacks()[answer - 1], pokemon,
							this.slowest) == -1) {
						System.err.println("There was a problem using this attack :(");
					}
					System.out.println(this.slowest.getName() + "'s HPs: " + HPBefore + " -> " + this.slowest.getHP());
				} else {
					if (Attack_Special.use((Attack_Special) pokemon.getAttacks()[answer - 1], pokemon,
							this.slowest) == -1) {
						System.err.println("There was a problem using this attack :(");
					}
					System.out.println(this.slowest.getName() + "'s HPs: " + HPBefore + " -> " + this.slowest.getHP());
				}

			} else {

				int HPBefore = this.fastest.getHP();

				if (pokemon.getAttacks()[answer - 1].getClass().getSimpleName().equals("Attack_Physical")) {
					if (Attack_Physical.use((Attack_Physical) pokemon.getAttacks()[answer - 1], pokemon,
							this.fastest) == -1) {
						System.err.println("There was a problem using this attack :(");
					}
					System.out.println(this.fastest.getName() + "'s HPs: " + HPBefore + " -> " + this.fastest.getHP());
				} else {
					if (Attack_Special.use((Attack_Special) pokemon.getAttacks()[answer - 1], pokemon,
							this.fastest) == -1) {
						System.err.println("There was a problem using this attack :(");
					}
					System.out.println(this.fastest.getName() + "'s HPs: " + HPBefore + " -> " + this.fastest.getHP());
				}

			}

		}

	}
}
