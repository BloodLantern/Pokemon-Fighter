package all;

import pokemons.Pokemon;

public class Player {
	
	private Pokemon[] team = new Pokemon[6];
	private Pokemon defaultSelected;

	public Player() {
	}
	
	public Player(Pokemon defaultSelected) {
		this.defaultSelected = defaultSelected;
	}
	
	public Player(Pokemon[] team) {
		this.team = team;
		this.defaultSelected = this.team[(int) Math.round(Math.random() * 5)];
	}
	
	public Player(Pokemon[] team, Pokemon defaultSelected) {
		this.team = team;
		this.defaultSelected = defaultSelected;
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

}
