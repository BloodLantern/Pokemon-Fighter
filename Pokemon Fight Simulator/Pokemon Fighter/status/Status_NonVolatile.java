package status;

/**
 * This is an Enumeration of all different Pokemon Non-Volatile Status so that
 * they can be used easily.
 * 
 * @author BloodLantern
 */
public enum Status_NonVolatile implements Status {
	
	BURN, FREEZE, PARALYSIS, POISON, BADLY_POISONED, SLEEP;

	@Override
	public void effect(Status status) {
		
		Status_NonVolatile temp = (Status_NonVolatile)status;
		
		switch (temp) {
		case BADLY_POISONED:
			
			break;
		case BURN:
			
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
			System.err.println("The selected Status_NonVolatile couldn't be found.");
			break;
		}
		
	}

}
