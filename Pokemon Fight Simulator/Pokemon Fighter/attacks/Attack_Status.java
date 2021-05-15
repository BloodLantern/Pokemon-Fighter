package attacks;

import pokemons.Types;

/**
 * This is an Enumeration containing all Attacks of "Status" type. It means that
 * these Attacks will affect the enemy Pokemon's status.
 * 
 * @author BloodLantern
 * @see status
 * @see status.Status_Volatile
 */
public enum Attack_Status implements Attacks {
	;

	@Override
	public Types getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAccuracy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPP(int pp) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSecondaryEffect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTextName() {
		// TODO Auto-generated method stub
		return null;
	}

}
