package status;

import pokemons.Pokemon;

/**
 * This is an Enumeration of all different Pokemon Volatile Status that only
 * lasts for the current battle so that they can be used easily.
 * 
 * @author BloodLantern
 */
public enum Status_VolatileBattle implements Status {

	AQUA_RING, BRACING, CHARGING_TURN, CENTER_OF_ATTENTION, DEFENSE_CURL, ROOTING, MAGIC_COAT, MAGNETIC_LEVITATION,
	MIMIC, MINIMIZE, PROTECTION, RECHARGING, SEMI_INVULNERABLE_TURN, SUBSTITUTE, TAKING_AIM, TRANSFORMED, WITHDRAWING;

	@Override
	public void effect(Pokemon affected, Status status) {
		
		Status_VolatileBattle temp = (Status_VolatileBattle)status;
		
		switch (temp) {
		case AQUA_RING:
			affected.setStatus(status);
			// Effect
			break;
		case BRACING:
			affected.setStatus(status);
			// Effect
			break;
		case CENTER_OF_ATTENTION:
			affected.setStatus(status);
			// Effect
			break;
		case CHARGING_TURN:
			affected.setStatus(status);
			// Effect
			break;
		case DEFENSE_CURL:
			affected.setStatus(status);
			// Effect
			break;
		case MAGIC_COAT:
			affected.setStatus(status);
			// Effect
			break;
		case MAGNETIC_LEVITATION:
			affected.setStatus(status);
			// Effect
			break;
		case MIMIC:
			affected.setStatus(status);
			// Effect
			break;
		case MINIMIZE:
			affected.setStatus(status);
			// Effect
			break;
		case PROTECTION:
			affected.setStatus(status);
			// Effect
			break;
		case RECHARGING:
			affected.setStatus(status);
			// Effect
			break;
		case ROOTING:
			affected.setStatus(status);
			// Effect
			break;
		case SEMI_INVULNERABLE_TURN:
			affected.setStatus(status);
			// Effect
			break;
		case SUBSTITUTE:
			affected.setStatus(status);
			// Effect
			break;
		case TAKING_AIM:
			affected.setStatus(status);
			// Effect
			break;
		case TRANSFORMED:
			affected.setStatus(status);
			// Effect
			break;
		case WITHDRAWING:
			affected.setStatus(status);
			// Effect
			break;
		default:
			System.err.println("The selected Status_VolatileBattle couldn't be found.");
			break;
		}

	}

}
