package pokemons;

/**
 * This is an Enumeration containing all differents Pokemon Types so they can be
 * used easily.
 * <p>
 * Their first use is with {@link pokemons.Weaknesses}.
 * 
 * @author BloodLantern
 */
public enum Types {

	BUG(11), DARK(15), DRAGON(14), ELECTRIC(3), FAIRY(17), FIGHTING(6), FIRE(1), FLYING(9), GHOST(13), GRASS(4),
	GROUND(8), ICE(5), NORMAL(0), POISON(7), PSYCHIC(10), ROCK(12), STEEL(16), WATER(2);

	private final int index;

	Types(int index) {
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}

	/**
	 * @return An array containing all different Types.
	 */
	public static Types[] getTypesList() {
		Types[] list = { Types.BUG, Types.DARK, Types.DRAGON, Types.ELECTRIC, Types.FAIRY, Types.FIGHTING, Types.FIRE,
				Types.FLYING, Types.GHOST, Types.GRASS, Types.GROUND, Types.ICE, Types.NORMAL, Types.POISON,
				Types.PSYCHIC, Types.ROCK, Types.STEEL, Types.WATER };
		return list;
	}

}
