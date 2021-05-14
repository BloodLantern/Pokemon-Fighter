package status;

import pokemons.Pokemon;

/**
 * This is an Enumeration of all different Pokemon Volatile Status so that they
 * can be used easily.
 * 
 * @author BloodLantern
 */
public enum Status_Volatile implements Status {

	BOUND, CAN_T_ESCAPE, CONFUSION, CURSE, EMBARGO, ENCORE, FLINCH, HEAL_BLOCK, IDENTIFIED, INFATUATION, LEECH_SEED,
	NIGHTMARE, PERISH_SONG, TAUNT, TELEKINESIS, TORMENT;

	@Override
	public void effect(Pokemon affected, Status status) {
		
		Status_Volatile temp = (Status_Volatile)status;
		
		switch (temp) {
		case BOUND:
			affected.setStatus(status);
			// Effect
			break;
		case CAN_T_ESCAPE:
			affected.setStatus(status);
			// Effect
			break;
		case CONFUSION:
			affected.setStatus(status);
			// Effect
			break;
		case CURSE:
			affected.setStatus(status);
			// Effect
			break;
		case EMBARGO:
			affected.setStatus(status);
			// Effect
			break;
		case ENCORE:
			affected.setStatus(status);
			// Effect
			break;
		case FLINCH:
			affected.setStatus(status);
			// Effect
			break;
		case HEAL_BLOCK:
			affected.setStatus(status);
			// Effect
			break;
		case IDENTIFIED:
			affected.setStatus(status);
			// Effect
			break;
		case INFATUATION:
			affected.setStatus(status);
			// Effect
			break;
		case LEECH_SEED:
			affected.setStatus(status);
			// Effect
			break;
		case NIGHTMARE:
			affected.setStatus(status);
			// Effect
			break;
		case PERISH_SONG:
			affected.setStatus(status);
			// Effect
			break;
		case TAUNT:
			affected.setStatus(status);
			// Effect
			break;
		case TELEKINESIS:
			affected.setStatus(status);
			// Effect
			break;
		case TORMENT:
			affected.setStatus(status);
			// Effect
			break;
		default:
			System.err.println("The selected Status_Volatile couldn't be found.");
			break;
		}
		
	}

}
