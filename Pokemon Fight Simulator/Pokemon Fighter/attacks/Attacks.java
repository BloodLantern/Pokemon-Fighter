package attacks;

import pokemons.Types;

/**
 * This is the interface implemented by all different Attacks.
 * <p>
 * They are listed below:
 * <p>
 * <ul>
 * <li>{@link attacks.Attack_Physical}
 * <li>{@link attacks.Attack_Special}
 * <li>{@link attacks.Attack_Status}
 * </ul>
 * 
 * @author knackiball
 */
public interface Attacks {
	Types getType();

	int getPower();

	int getAccuracy();

	int getPP();

	void setPP(int pp);

	String getSecondaryEffect();

	String getTextName();
}
