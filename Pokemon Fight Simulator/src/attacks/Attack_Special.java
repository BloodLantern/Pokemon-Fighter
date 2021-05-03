package attacks;

import pokemons.Pokemon;
import pokemons.Types;

public enum Attack_Special implements Attacks {
	CHARGE_BEAM(Types.ELECTRIC, 50, 90, 10, "", "Charge Beam");
	
	private final Types type;
	private final int power;
	private final int accuracy;
	private final int pp;
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
	public int use(Attack_Special attack, Pokemon attacker, Pokemon attacked) {
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
		
		CM *= Pokemon.weakness(attacker.getType(), attacked.getType());
		
		// Damage formula
		int finalDamage = (int)Math.floor(((attacker.getLevel()*0.4+2)*attacker.getSpAtk()*attack.getPower()/attacked.getSpDef()*50+2)*CM);
		
		attacked.setHP(attacked.getHP() - finalDamage);
		
		return finalDamage;
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


	public String getSecondaryEffect() {
		return secondaryEffect;
	}


	public String getTextName() {
		return textName;
	}
	
}
