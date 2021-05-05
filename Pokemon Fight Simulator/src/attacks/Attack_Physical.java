package attacks;

import pokemons.Pokemon;
import pokemons.Types;

public enum Attack_Physical implements Attacks {
	BOLT_BEAK(Types.ELECTRIC, 85, 100, 10, "power*2 if first", "Bolt Beak"), BOLT_STRIKE(Types.ELECTRIC, 130, 85, 5, "20% paralysis", "Bolt Strike"),
	FUSION_BOLT(Types.ELECTRIC, 100, 100, 5, "", "Fusion Bolt"), NUZZLE(Types.ELECTRIC, 20, 100, 20, "100% paralysis", "Nuzzle"),
	PLASMA_FISTS(Types.ELECTRIC, 100, 100, 15, "all normal type moves in the same turn : electric type", "Plasma Fists"), SPARK(Types.ELECTRIC, 65, 100, 20, "30% paralysis", "Spark"),
	THUNDER_FANG(Types.ELECTRIC, 65, 95, 15, "10% paralysis, 10% flinch", "Thunder Fang"), THUNDER_PUNCH(Types.ELECTRIC, 75, 100, 15, "10% paralysis", "Thunder Punch"),
	VOLT_TACKLE(Types.ELECTRIC, 120, 100, 15, "1/3 recoil", "Volt Tackle"), WILD_CHARGE(Types.ELECTRIC, 90, 100, 15, "1/4 recoil", "Wild Charge"),
	ZING_ZAP(Types.ELECTRIC, 80, 100, 10, "30% flinch", "Zing Zap"), BARRAGE(Types.NORMAL, 15, 85, 20, "hits 2 to five times in a row", "Barrage"),
	BODY_SLAM(Types.NORMAL, 85, 100, 15, "30% paralysis", "Body Slam"), COVET(Types.NORMAL, 60, 100, 25, "steals foe's item", "Covet"),
	CUT(Types.NORMAL, 50, 95, 30, "", "Cut"), TACKLE(Types.NORMAL, 40, 100, 35, "", "Tackle"),
	DOUBLE_EDGE(Types.NORMAL, 120, 100, 15, "1/4 recoil", "Double Edge"), HEADBUTT(Types.NORMAL, 70, 100, 15, "30% flinch", "Headbutt"),
	RAPID_SPIN(Types.NORMAL, 20, 100, 40, "speed +1, removes entry hazards for allies", "Rapid Spin"), STRENGTH(Types.NORMAL, 80, 100, 15, "", "Strength"),
	EARTHQUAKE(Types.GROUND, 100, 100, 10, "", "Earthquake"), ROCK_SLIDE(Types.ROCK, 75, 90, 10, "30% flinch", "Rock Slide"),
	ROUGH_PLAY(Types.FAIRY, 90, 90, 10, "10% lowers foe's attack by 1 stage", "Rough Play"), CLOSE_COMBAT(Types.FIGHTING, 120, 100, 5, "lowers user's def and spDef by 1 stage", "Close Combat"),
	SHADOW_CLAW(Types.GHOST, 70, 100, 15, "1/8 critical hit", "Shadow Claw"), ICE_PUNCH(Types.ICE, 75, 100, 15, "10% freeze", "Ice punch"),
	IRON_HEAD(Types.STEEL, 80, 100, 15, "30% flinch", "Iron head"), POISON_JAB(Types.POISON, 80, 100, 20, "30% poison", "Poison jab"),
	ZEN_HEADBUTT(Types.PSYCHIC, 80, 90, 15, "20% flinch", "Zen headbutt"), LIQUIDATION(Types.WATER, 85, 100, 10, "10% lowers foe's Def by 1 stage", "Liquidation"),
	KNOCK_OFF(Types.DARK, 65, 100, 20, "if foe has an item: removes it + power*1.5", "Knock Off"), DARKEST_LARIAT(Types.DARK, 85, 100, 10, "ignores foe's stats changes", "Darkest Lariat"),
	DRAGON_CLAW(Types.DRAGON, 80, 100, 15, "", "Dragon claw"), ACROBATICS(Types.FLYING, 55, 100, 15, "power*2 if user has no item", "Acrobatics"),
	VINE_WHIP(Types.GRASS, 45, 100, 25, "", "Vine whip");

	private final Types type;
	private final int power;
	private final int accuracy;
	private int pp;
	private final String secondaryEffect;
	private final String textName;
	
	Attack_Physical(Types type, int power, int accuracy, int pp, String secondaryEffect, String textName) {
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
	public static int use(Attack_Physical attack, Pokemon attacker, Pokemon attacked) {
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
				
				double rdm = 1;
				do {
					rdm = Math.random();
				} while (rdm < 0.85);
				CM *= rdm;
			
				// TODO Items, talents multiplier
				
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
				
				double rcrit = Math.floor(Math.random()*24+1); //lancer de dé a 24 faces
				if(rcrit == 1 && CM != 0) {
					System.out.println("A critical hit!");
					CM *= 1;
				}
				
				// Damage calc
				int finalDamage = (int)Math.floor((((attacker.getLevel()*0.4+2)*attacker.getAtk()*attack.getPower())/(attacked.getDef()*50)+2)*CM);
				
				attacked.setHP(Math.max(attacked.getHP() - finalDamage, 0));
				
				return finalDamage;
				} else {
					return -1;
				}
			}
			else {
				System.err.println("You don't have enough PP to use " + attack.getTextName() + "!");
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
