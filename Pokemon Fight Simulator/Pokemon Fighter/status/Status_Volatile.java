package status;

import pokemons.Pokemon;

/**
 * This is an Enumeration of all different Pokemon Volatile Status so that they
 * can be used easily.
 * 
 * @author BloodLantern
 * @see status Status package
 * @see status.Status Status interface
 * @see status.Status_NonVolatile Non-Volatile Status
 * @see status.Status_VolatileBattle Volatile Status that only lasts for the
 *      current fight
 */
public enum Status_Volatile implements Status {

	BOUND, CAN_T_ESCAPE, CONFUSION, CURSE, EMBARGO, ENCORE, FLINCH, HEAL_BLOCK, IDENTIFIED, INFATUATION, LEECH_SEED,
	NIGHTMARE, PERISH_SONG, TAUNT, TELEKINESIS, TORMENT;

	@Override
	public void effect(Pokemon affected, Status status) {

		affected.setStatus(status);
		Status_Volatile temp = (Status_Volatile) status;

		switch (temp) {
		case BOUND:

			break;
		case CAN_T_ESCAPE:

			break;
		case CONFUSION:

			break;
		case CURSE:

			break;
		case EMBARGO:

			break;
		case ENCORE:

			break;
		case FLINCH:

			break;
		case HEAL_BLOCK:

			break;
		case IDENTIFIED:

			break;
		case INFATUATION:

			break;
		case LEECH_SEED:

			break;
		case NIGHTMARE:

			break;
		case PERISH_SONG:

			break;
		case TAUNT:

			break;
		case TELEKINESIS:

			break;
		case TORMENT:

			break;
		default:
			System.err.println("The selected Status_Volatile couldn't be found or is null -> " + status.toString());
			break;
		}

	}

}
