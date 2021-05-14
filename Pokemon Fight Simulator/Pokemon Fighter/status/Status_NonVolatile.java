package status;

import pokemons.Pokemon;

/**
 * This is an Enumeration of all different Pokemon Non-Volatile Status so that
 * they can be used easily.
 * 
 * @author BloodLantern
 */
public enum Status_NonVolatile implements Status {
	
	BURN, FREEZE, PARALYSIS, POISON, BADLY_POISONED, SLEEP;

	@Override
	public void effect(Pokemon affected, Status status) {
		
		Status_NonVolatile temp = (Status_NonVolatile)status;
		
		switch (temp) {
		case BADLY_POISONED:
			affected.setStatus(status);
			// Effect
			break;
		case BURN:
			affected.setStatus(status);
			// Effect
			break;
		case FREEZE:
			affected.setStatus(status);
			// Effect
			break;
		case PARALYSIS:
			affected.setStatus(status);
			// Effect
			break;
		case POISON:
			affected.setStatus(status);
			// Effect
			break;
		case SLEEP:
			affected.setStatus(status);
			// Effect
			break;
		default:
			System.err.println("The selected Status_NonVolatile couldn't be found.");
			break;
		}
		
	}

}
