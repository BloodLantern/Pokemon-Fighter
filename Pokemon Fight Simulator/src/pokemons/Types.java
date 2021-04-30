package pokemons;

public enum Types {
	
BUG (11),
DARK (15),
DRAGON (14),
ELECTRIC (3),
FAIRY (17),
FIGHTING (6),
FIRE (1),
FLYING (9),
GHOST (13),
GRASS (4),
GROUND (8),
ICE (5),
NORMAL (0),
POISON (7),
PSYCHIC (10),
ROCK (12),
STEEL (16),
WATER (2);

private final int index;

Types(int index) {
	this.index = index;
}

public int getIndex() {
	return this.index;
}

}
