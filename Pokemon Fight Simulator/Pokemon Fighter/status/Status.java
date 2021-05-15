package status;

import pokemons.Pokemon;

/**
 * This is the interface implemented by all different Status.
 * <p>
 * The 3 groups are listed below:
 * <p>
 * <ul>
 * <li>{@link status.Status_Volatile}
 * <li>{@link status.Status_NonVolatile}
 * <li>{@link status.Status_VolatileBattle}
 * </ul>
 * 
 * @author BloodLantern
 */
public interface Status {

	/**
	 * This method must be implemented by all different status.
	 * <p>
	 * It contains a {@code switch} statement for all status of this group.
	 * 
	 * @param status is the status' effect you want to apply.
	 */
	public void effect(Pokemon affected, Status status);

}
