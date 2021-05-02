package attacks;

import pokemons.Pokemon;
import pokemons.Types;

public enum Attack_Physical {
	BOLT_BEAK(Types.ELECTRIC, 85, 100, 10, "power*2 if first"), BOLT_STRIKE(Types.ELECTRIC, 130, 85, 5, "20% paralysis"),
	FUSION_BOLT(Types.ELECTRIC, 100, 100, 5, ""), NUZZLE(Types.ELECTRIC, 20, 100, 20, "100% paralysis"),
	PLASMA_FISTS(Types.ELECTRIC, 100, 100, 15, "all normal type moves in the same turn : electric type"), SPARK(Types.ELECTRIC, 65, 100, 20, "30% paralysis"),
	THUNDER_FANG(Types.ELECTRIC, 65, 95, 15, "10% paralysis, 10% flinch"), THUNDER_PUNCH(Types.ELECTRIC, 75, 100, 15, "10% paralysis"),
	VOLT_TACKLE(Types.ELECTRIC, 120, 100, 15, "1/3 recoil"), WILD_CHARGE(Types.ELECTRIC, 90, 100, 15, "1/4 recoil"),
	ZING_ZAP(Types.ELECTRIC, 80, 100, 10, "30% flinch");
	
	private final Types type;
	private final int power;
	private final int accuracy;
	private final int pp;
	private final String secondaryEffect;
	
	Attack_Physical(Types type, int power, int accuracy, int pp, String secondaryEffect) {
		this.type = type;
		this.power = power;
		this.accuracy = accuracy;
		this.pp = pp;
		this.secondaryEffect = secondaryEffect;
	}
	
	
	/**
	 * This method "uses" the parameterized attack with the
	 * pokemon attacker against the pokemon attacked. It returns
	 * the final damage of this attack with these parameters.
	 */
	public int use(Attack_Physical attack, Pokemon attacker, Pokemon attacked) {
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
		int finalDamage = (int)Math.floor(((attacker.getLevel()*0.4+2)*attacker.getAtk()*attack.getPower()/attacked.getDef()*50+2)*CM);
		
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
	
}
