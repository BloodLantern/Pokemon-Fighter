package attacks;

import pokemons.Pokemon;
import pokemons.Types;

public enum Attack_Special implements Attacks {
	CHARGE_BEAM(Types.ELECTRIC, 50, 90, 10, "", "Charge Beam");
	
	private final Types type;
	private final int power;
	private final int accuracy;
	private int pp;
	private final String secondaryEffect;
	private final String textName;
	
	Attack_Special(Types type, int power, int accuracy, int pp, String secondaryEffect, String textName) {
		this.type = type;
		this.power = power;
		this.accuracy = accuracy;
		this.pp = pp;
		this.secondaryEffect = secondaryEffect;
		this.textName = textName;
	}
	
	
	/**
	 * This method "uses" the parameterized attack with the
	 * pokemon attacker against the pokemon attacked. It returns
	 * the final damage of this attack with these parameters.
	 */
	public static int use(Attack_Special attack, Pokemon attacker, Pokemon attacked) {
		if (attack != null) {
			
			if (attack.getPp() > 0) {
				attack.setPp(attack.getPp() - 1);
				
				double CM = 1;
				
				if (attack.getType() == attacker.getType())
					CM *= 1.5;
				
				// TODO Critical hit
				
				double rdm = 1;
				do {
					rdm = Math.random();
				} while (rdm < 0.85);
				CM *= rdm;
			
				// TODO Objects, talents multiplier
				
				float weakness = 1.0f;
				weakness *= Pokemon.weakness(attack.getType(), attacked.getType());
				if (attacked.getType2() != null)
					weakness *= Pokemon.weakness(attack.getType(), attacked.getType2());
			
				if (weakness < 0.5f) {
					System.out.println("It isn't efficient at all !");
				} else if (weakness >= 0.5f && weakness < 1.0f) {
					System.out.println("It isn't very efficient.");
				} else if (weakness >= 1.0f && weakness < 1.5f) {
					System.out.println("It is efficient.");
				} else if (weakness >= 1.5f) {
					System.out.println("It is very efficient !");
				}
				CM *= weakness;
				
				// Damage formula
				int finalDamage = (int)Math.floor((((attacker.getLevel()*0.4+2)*attacker.getSpAtk()*attack.getPower())/(attacked.getSpDef()*50)+2)*CM);
				
				attacked.setHP(Math.max(attacked.getHP() - finalDamage, 0));
				
				return finalDamage;
			} else {
				System.err.println("You don't have enough PP to use " + attack.getTextName() + " !");
				return -1;
			}
			
		}  else {
			System.err.println("Attack is null !");
			return -1;
		}
	}

	public Types getType() {
		return type;
	}

	public int getPower() {
		return power;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getPp() {
		return pp;
	}
	
	public void setPp(int pp) {
		this.pp = pp;
	}


	public String getSecondaryEffect() {
		return secondaryEffect;
	}


	public String getTextName() {
		return textName;
	}
	
}
