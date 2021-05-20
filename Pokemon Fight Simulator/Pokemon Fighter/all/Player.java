package all;

import pokemons.Pokemon;

/**
 * This is the class containing all fields and methods about the Player.
 * 
 * @author BloodLantern
 */
public class Player {

	private Pokemon[] team = new Pokemon[6];
	private Pokemon defaultSelected;
	private String username;

	public Player(String name) {
		this.username = name;
	}

	public Player(String name, Pokemon defaultSelected) {
		this.username = name;
		this.defaultSelected = defaultSelected;
	}

	public Player(String name, Pokemon[] team) {
		this.username = name;
		this.team = team;
		this.defaultSelected = this.team[(int) Math.round(Math.random() * 5)];
	}

	public Player(String name, Pokemon[] team, Pokemon defaultSelected) {
		this.username = name;
		this.team = team;
		this.defaultSelected = defaultSelected;
	}

	public boolean areAllDead() {
		int deadCount = 0;

		for (Pokemon p : this.getTeam())
			if (p.getHP() <= 0)
				deadCount++;

		if (deadCount == 6) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return The non-null values count.
	 */
	public int getTeamLength() {
		int i = 0;

		for (Pokemon p : this.getTeam()) {
			if (p != null)
				i++;
		}

		return i;
	}

	public Pokemon[] getTeam() {
		return team;
	}

	public void setTeam(Pokemon[] team) {
		this.team = team;
	}

	public Pokemon getDefaultSelected() {
		return defaultSelected;
	}

	public void setDefaultSelected(Pokemon defaultSelected) {
		this.defaultSelected = defaultSelected;
	}

	public String getUsername() {
		return username;
	}

}
