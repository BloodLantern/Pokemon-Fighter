package attacks;

import pokemons.Pokemon;
import pokemons.Types;

public enum Attack_Special implements Attacks {
	CHARGE_BEAM(Types.ELECTRIC, 50, 90, 10, "70% spAtk +1", "Charge Beam"), MOONBLAST(Types.FAIRY, 95, 100, 15, "10% lowers foe's spAtk by 1 stage", "Moonblast"),
	BOOMBURST(Types.NORMAL, 140, 100, 10, "", "Boomburst"), FLAMETHROWER(Types.FIRE, 90, 100, 15, "10% burn", "Flamethrower"),
	FIRE_BLAST(Types.FIRE, 110, 85, 5, "10% burn", "Fire Blast"), SCALD(Types.WATER, 80, 100, 15, "30% burn", "Scald"),
	SURF(Types.WATER, 90, 100, 15, "", "Surf"), HYDRO_PUMP(Types.WATER, 110, 80, 5, "", "Hydro Pump"),
	THUNDERBOLT(Types.ELECTRIC, 90, 100, 15, "10% paralysis", "Thunderbolt"), THUNDER(Types.ELECTRIC, 110, 70, 10, "30% paralysis", "Thunder"),
	ICE_BEAM(Types.ICE, 90, 100, 10, "10% freeze", "Ice beam"), BLIZZARD(Types.ICE, 110, 70, 5, "10% freeze", "Blizzard"),
	PSYCHIC(Types.PSYCHIC, 90, 100, 10, "10% lowers foe's spDef by 1 stage", "Psychic"), SHADOW_BALL(Types.GHOST, 80, 100, 15, "20% lowers foe's spDef by 1 stage", "Shadow ball"),
	FOCUS_BLAST(Types.FIGHTING, 120, 70, 5, "10% lowers foe's spDef by 1 stage", "Focus Blast"), AURA_SPHERE(Types.FIGHTING, 80, 1000, 10, "", "Aura sphere"),
	EARTH_POWER(Types.GROUND, 90, 100, 10, "10% lowers foe's spDef by 1 stage", "Earth power"), BUG_BUZZ(Types.BUG, 90, 100, 10, "10% lowers foe's spDef by 1 stage", "Bug buzz"),
	DARK_PULSE(Types.DARK, 80, 100, 15, "20% flinch", "Dark pulse"), DRAGON_BREATH(Types.DRAGON, 60, 100, 20, "30% paralysis", "Dragon Breath"),
	LEAF_STORM(Types.GRASS, 130, 90, 5, "lowers user's spAtk by 2 stages", "Leaf storm"), HURRICANE(Types.FLYING, 110, 70, 10, "30% confusion", "Hurricane"),
	ENERGY_BALL(Types.GRASS, 90, 100, 10, "10% lowers foe's spDef by 1 stage", "Energy ball");
	
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
				
				if (Math.random() > (float)attack.getAccuracy()/100) {
					System.out.println(attacker.getName() + " missed its attack!");
					return -1;
				}
				
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
				weakness *= Pokemon.weakness(attacked.getType(), attack.getType());
				if (attacked.getType2() != null)
					weakness *= Pokemon.weakness(attacked.getType2(), attack.getType());
			
				if (weakness == 0.25f) {
					System.out.println("It is not effective at all!");
				} else if (weakness == 0.5f) {
					System.out.println("It is not very effective.");
				} else if (weakness == 1.0f) {
					System.out.println("It is normally effective.");
				} else if (weakness == 2.0f) {
					System.out.println("It is super effective!");
				} else if (weakness == 4.0f) {
					System.out.println("It is really super effective!");
				} else if (weakness == 0.0f){
					System.out.println("It has no effect!");
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
