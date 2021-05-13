package status;

import pokemons.Pokemon;

public interface Status {

	/**
	 * All status must implement this method and define it for their own effect.
	 * This should be made by affecting this Pokemon's statistics or bypassing his
	 * turn during a fight.
	 * 
	 * @param affected
	 */
	public abstract void effect(Pokemon affected);

}
