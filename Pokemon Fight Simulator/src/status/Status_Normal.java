package status;

import pokemons.Pokemon;

public class Status_Normal implements Status {
	
	/**
	 * Normal status has no effect
	 */
	@Override
	public void effect(Pokemon affected) {}
	
	public Status_Normal(Pokemon a) {
		this.effect(a);
	}

}
