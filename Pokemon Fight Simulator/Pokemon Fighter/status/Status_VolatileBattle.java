package status;

import pokemons.Pokemon;

/**
 * This is an Enumeration of all different Pokemon Volatile Status that only
 * lasts for the current battle so that they can be used easily.
 * 
 * @author BloodLantern
 * @see status Status package
 * @see status.Status Status interface
 * @see status.Status_Volatile Volatile Status
 * @see status.Status_NonVolatile Non-Volatile Status
 */
public enum Status_VolatileBattle implements Status {

	AQUA_RING, BRACING, CHARGING_TURN, CENTER_OF_ATTENTION, DEFENSE_CURL, ROOTING, MAGIC_COAT, MAGNETIC_LEVITATION,
	MIMIC, MINIMIZE, PROTECTION, RECHARGING, SEMI_INVULNERABLE_TURN, SUBSTITUTE, TAKING_AIM, TRANSFORMED, WITHDRAWING;

	@Override
	public void effect(Pokemon affected, Status status) {

		affected.setStatus(status);
		Status_VolatileBattle temp = (Status_VolatileBattle) status;

		switch (temp) {
		case AQUA_RING:

			break;
		case BRACING:

			break;
		case CENTER_OF_ATTENTION:

			break;
		case CHARGING_TURN:

			break;
		case DEFENSE_CURL:

			break;
		case MAGIC_COAT:

			break;
		case MAGNETIC_LEVITATION:

			break;
		case MIMIC:

			break;
		case MINIMIZE:

			break;
		case PROTECTION:

			break;
		case RECHARGING:

			break;
		case ROOTING:

			break;
		case SEMI_INVULNERABLE_TURN:

			break;
		case SUBSTITUTE:

			break;
		case TAKING_AIM:

			break;
		case TRANSFORMED:

			break;
		case WITHDRAWING:

			break;
		default:
			System.err
					.println("The selected Status_VolatileBattle couldn't be found or is null -> " + status.toString());
			break;
		}

	}

}
