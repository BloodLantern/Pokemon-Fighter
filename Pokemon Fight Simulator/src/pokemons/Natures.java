package pokemons;

public enum Natures {
	
	ADAMANT(0, "Atk", "SpAtk"), BASHFUL(1, "", ""), BOLD(2, "Def", "Atk"), BRAVE(3, "Atk", "Speed"), CALM(4, "SpDef", "Atk"), CAREFUL(5, "SpDef", "SpAtk"), DOCILE(6, "", ""),
	GENTLE(7, "SpDef", "Def"), HARDY(8, "", ""), HASTY(9, "Speed", "Def"), IMPISH(10, "Def", "SpAtk"), JOLLY(11, "Speed", "SpAtk"), LAX(12, "Def", "SpDef"), LONELY(13, "Atk", "Def"),
	MILD(14, "SpAtk", "Def"), MODEST(15, "SpAtk", "Atk"), NAIVE(16, "Speed", "SpDef"), NAUGHTY(17, "Atk", "SpDef"), QUIET(18, "SpAtk", "Speed"), QUIRKY(19, "Atk", "Speed"),
	RASH(20, "SpAtk", "SpDef"), RELAXED(21, "Def", "Speed"), SASSY(22, "SpDef", "Speed"), SERIOUS(23, "", ""), TIMID(24, "Speed", "Atk");
	
	private final int index;
	private final String plus;
	private final String minus;
	
	Natures(int index, String plus, String minus) {
		this.index = index;
		this.plus = plus;
		this.minus = minus;
	}

	public int getIndex() {
		return index;
	}

	public String getPlus() {
		return plus;
	}

	public String getMinus() {
		return minus;
	}
	
}
