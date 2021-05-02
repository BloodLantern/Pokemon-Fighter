package pokemons;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Natures {
	
	ADAMANT("Atk", "SpAtk"), BASHFUL("", ""), BOLD("Def", "Atk"), BRAVE("Atk", "Speed"), CALM("SpDef", "Atk"), CAREFUL("SpDef", "SpAtk"), DOCILE("", ""),
	GENTLE("SpDef", "Def"), HARDY("", ""), HASTY("Speed", "Def"), IMPISH("Def", "SpAtk"), JOLLY("Speed", "SpAtk"), LAX("Def", "SpDef"), LONELY("Atk", "Def"),
	MILD("SpAtk", "Def"), MODEST("SpAtk", "Atk"), NAIVE("Speed", "SpDef"), NAUGHTY("Atk", "SpDef"), QUIET("SpAtk", "Speed"), QUIRKY("Atk", "Speed"),
	RASH("SpAtk", "SpDef"), RELAXED("Def", "Speed"), SASSY("SpDef", "Speed"), SERIOUS("", ""), TIMID("Speed", "Atk");
	
	private final String plus;
	private final String minus;
	
	// These variables are only useful to select a random value of type Natures
	private static final List<Natures> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final Random RANDOM = new Random();
	
	public static Natures randomNature() {
		return VALUES.get(RANDOM.nextInt(VALUES.size()));
	}
	
	Natures(String plus, String minus) {
		this.plus = plus;
		this.minus = minus;
	}

	public String getPlus() {
		return plus;
	}

	public String getMinus() {
		return minus;
	}
	
}
