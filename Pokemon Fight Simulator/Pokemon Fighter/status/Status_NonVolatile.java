package status;

import pokemons.Pokemon;

/**
 * This is an Enumeration of all different Pokemon Non-Volatile Status so that
 * they can be used easily.
 * 
 * @author BloodLantern
 * @see status Status package
 * @see status.Status Status interface
 * @see status.Status_Volatile Volatile Status
 * @see status.Status_VolatileBattle Volatile Status that only lasts for the
 *      current fight
 */
public enum Status_NonVolatile implements Status {
	/**
	 * Half the physical damage this Pokemon should inflict and causes it to lose
	 * 1/16 of his maximum HPs each turn (at the end). This has no effect if it acts
	 * on a Fire Type Pokemon.
	 */
	BURN,

	/**
	 * A Pokemon affected by this status cannot attack. Each turn, this Pokemon has
	 * a 20% chance to come back normal. An Ice Type Pokemon cannot be frozen by an
	 * Ice Type Attack.
	 */
	FREEZE,

	/**
	 * A paralyzed Pokemon has a 25% chance to not attack. Moreover, he loses half
	 * his speed. Electric Type Pokemon cannot be affected by this status.
	 */
	PARALYSIS,

	/**
	 * A poisoned Pokemon loses 1/16 of its maximum HPs each turn. Poison and Steel
	 * Type Pokemon aren't affected by this status.
	 * 
	 * @see status.Status_NonVolatile#BADLY_POISONED
	 */
	POISON,

	/**
	 * A badly-poisoned Pokemon loses more HPs each turn, adding 1/16 maximum HPs
	 * each turn to the last damage and starting at 1/16.
	 * 
	 * @see status.Status_NonVolatile#POISON
	 */
	BADLY_POISONED,

	/**
	 * An asleep Pokemon cannot use any Attack. It wakes up after 1 to 3 turn.
	 */
	SLEEP;

	@Override
	public void effect(Pokemon affected, Status status) {

		affected.setStatus(status);
		Status_NonVolatile temp = (Status_NonVolatile) status;

		switch (temp) {
		case BADLY_POISONED:

			break;
		case BURN:
			System.out.println(affected.getName() + " is burning !");
			System.out.print(affected.getName() + "'s HPs" + affected.getHP() + " -> ");
			affected.setHP(affected.getHP() - Math.round(affected.getHP() / 16));
			System.out.println(affected.getHP());
			break;
		case FREEZE:

			break;
		case PARALYSIS:

			break;
		case POISON:

			break;
		case SLEEP:

			break;
		default:
			System.err.println("The selected Status_NonVolatile couldn't be found or is null -> " + status.toString());
			break;
		}

	}

}
