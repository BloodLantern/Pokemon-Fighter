package all;

import java.awt.EventQueue;

import attacks.*;
import gui.MainWindow;
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

/**
 * This is basically the Main class, the only one containing a {@code public
 * static void main(String[] args) {}} method
 * 
 * @author BloodLantern
 * @author knackiball
 * @see all.Fight
 */
class Main {

	public static void main(String[] args) {
		// createMainWindow();
		createFight();
	}

	private static void createMainWindow() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void createFight() {
		Pokemon go = new Golem(100);
		Pokemon ty = new Tyranitar(100);

		Player player1 = new Player("Player 1", new Pokemon[] { go, new Alakazam(100), new Eevee(100),
				new Acromatisse(100), new Clefairy(100), new Xerneas(100) }, go);
		Player player2 = new Player("Player 2", new Pokemon[] { ty, new Raichu(100), new Azumarill(100),
				new Bouffalant(100), new Ditto(100), new Wooloo(100) }, ty);

		player1.getTeam()[0].addAttack(Attack_Physical.EARTHQUAKE);
		player1.getTeam()[0].addAttack(Attack_Physical.STONE_EDGE);
		player1.getTeam()[0].addAttack(Attack_Physical.BODY_SLAM);
		player1.getTeam()[0].addAttack(Attack_Physical.KNOCK_OFF);
		player1.getTeam()[1].addAttack(Attack_Special.FOCUS_BLAST);
		player1.getTeam()[1].addAttack(Attack_Special.PSYCHIC);
		player1.getTeam()[1].addAttack(Attack_Special.SHADOW_BALL);
		player1.getTeam()[1].addAttack(Attack_Special.ENERGY_BALL);
		player2.getTeam()[0].addAttack(Attack_Physical.EARTHQUAKE);
		player2.getTeam()[0].addAttack(Attack_Physical.KNOCK_OFF);
		player2.getTeam()[0].addAttack(Attack_Physical.STONE_EDGE);
		player2.getTeam()[0].addAttack(Attack_Physical.ICE_PUNCH);

		// Add Attack_Physical.HEADBUTT to the Pokemon if it hasn't already any attack.
		for (Pokemon p : player1.getTeam()) {
			if (p.getAttacksLength() < 4) {
				if (p.getAttacksLength() < 4) {
					p.addAttack(Attack_Physical.HEADBUTT);
				}
			}
			p.setOwner(player1);
			p.initAttacksPP();
		}
		// Same for the other player
		for (Pokemon p : player2.getTeam()) {
			if (p.getAttacksLength() < 4) {
				p.addAttack(Attack_Physical.HEADBUTT);
			}
			p.setOwner(player2);
			p.initAttacksPP();
		}

		Fight f = new Fight(player1, player2);
		f.begin();
	}

}
