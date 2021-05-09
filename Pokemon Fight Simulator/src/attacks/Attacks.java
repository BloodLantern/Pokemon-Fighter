package attacks;

import pokemons.Types;

public interface Attacks {
	Types getType();
	int getPower();
	int getAccuracy();
	int getPp();
	void setPp(int pp);
	String getSecondaryEffect();
	String getTextName();
}
