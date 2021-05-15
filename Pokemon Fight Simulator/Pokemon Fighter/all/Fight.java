package all;

import java.util.Scanner;

import attacks.*;
import pokemons.Pokemon;

/**
 * This is the class where the fight working takes place.
 * 
 * @author BloodLantern
 * @author knackiball
 * @see all.Main
 */
public class Fight {

	Player player1;
	Player player2;
	Pokemon pokemon1;
	Pokemon pokemon2;
	private Pokemon fastest;
	private Pokemon slowest;
	private Scanner sc;
	private int answer;

	public Fight(Player player1, Player player2) {

		this.player1 = player1;
		this.player2 = player2;
		this.pokemon1 = player1.getDefaultSelected();
		this.pokemon2 = player2.getDefaultSelected();
		sc = new Scanner(System.in);

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
			if (player1.areAllDead()) {
				System.out.println(pokemon1.getName() + " died.\n" + pokemon2.getName() + " won the fight !");
			} else {
				System.out.println(pokemon1.getName() + " died.");
				switchPokemon(player1, pokemon1);
				begin();
			}
		} else {
			if (player2.areAllDead()) {
				System.out.println(pokemon2.getName() + " died.\n" + pokemon1.getName() + " won the fight !");
			} else {
				System.out.println(pokemon2.getName() + " died.");
				switchPokemon(player2, pokemon2);
				begin();
			}
		}
		sc.close();
	}

	private void turn(Pokemon pokemon) {
		if (pokemon.equals(fastest)) {
			System.out.println(pokemon.getName() + " plays first !");
		} else {
			System.out.println(pokemon.getName() + " plays !");
		}
		chooseAction(pokemon.getOwner(), pokemon);
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

	private void chooseAction(Player player, Pokemon pokemon) {

		System.out.println("Choose an action to do:\n1 - Attack\n2 - Switch");
		answer = sc.nextInt();
		if (answer == 1) {

			chooseAttack(player, pokemon);

		} else if (answer == 2) {

			switchPokemon(player, pokemon);

		} else {
			System.err.println("Invalid answer !");
		}

	}

	private void chooseAttack(Player player, Pokemon pokemon) {
		int attackCount = 1;
		System.out.println("Choose an attack to use:\n1 - " + (pokemon.getAttacks()[0]).getTextName() + " > " + pokemon.getAttacks()[0].getPP() + " PP(s)");
		if (pokemon.getAttacksLength() > 1) {
			System.out.println("2 - " + (pokemon.getAttacks()[1]).getTextName() + " > " + pokemon.getAttacks()[1].getPP() + " PP(s)");
			attackCount = 2;
			if (pokemon.getAttacksLength() > 2) {
				System.out.println("3 - " + (pokemon.getAttacks()[2]).getTextName() + " > " + pokemon.getAttacks()[2].getPP() + " PP(s)");
				attackCount = 3;
				if (pokemon.getAttacksLength() > 3) {
					System.out.println("4 - " + (pokemon.getAttacks()[3]).getTextName() + " > " + pokemon.getAttacks()[3].getPP() + " PP(s)");
					attackCount = 4;
				}
			}
		}
		System.out.println("\n0 - Choose another action");
		answer = askAnswer(0, attackCount);

		if (answer == 0) {
			chooseAction(player, pokemon);
		} else {
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

	private void switchPokemon(Player player, Pokemon pokemon) {
		System.out.println("Choose a Pokemon to switch with:");
		int i = 0;
		for (Pokemon p : player.getTeam()) {
			if (!p.equals(pokemon) && p.getHP() > 0) {
				i++;
				System.out.println(i + " - " + p.getName());
			}
		}
		if (pokemon.getHP() > 0) {
			System.out.println("\n0 - Choose another action");
			answer = askAnswer(0, i);
		} else {
			answer = askAnswer(1, i);
		}
		i = 0;
		
		if (answer == 0 && pokemon.getHP() > 0) {
			chooseAction(player, pokemon);
		} else {
			for (Pokemon p : player.getTeam()) {
				if (!p.equals(pokemon) && p.getHP() > 0) {
					i++;
					if (answer == i) {
						System.out.print(pokemon.getName() + " is changing to ");
						if (pokemon.equals(pokemon1)) {
							pokemon1 = p;
						} else {
							pokemon2 = p;
						}
						pokemon = p;
						System.out.println(pokemon.getName() + " !");
						fastest(pokemon1, pokemon2);
						break;
					}
				}
			}
		}
	}
	
	/**
	 * This method is used to get an answer from the console user.
	 * 
	 * @param first is above what number should be the answer.
	 * @param second is under what number should be the answer.
	 * @return An Integer value entered by the user.
	 */
	private int askAnswer(int first, int second) {
		int answer;
		while (true) {
			answer = sc.nextInt();
			if (answer < first || answer > second) {
				System.out.println("Please enter a correct answer !");
			} else {
				break;
			}
		}
		return answer;
	}
}
