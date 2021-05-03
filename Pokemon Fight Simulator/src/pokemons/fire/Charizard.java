package pokemons.fire;

import pokemons.Natures;
import pokemons.Types;

public class Charizard extends Charmeleon {

public Charizard() {
		
		this.setName("Charizard");
		this.generateIVs();
		initStats();
		
	}
	
	public Charizard(int level) {
		
		this.setName("Charizard");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Charizard(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Charizard(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FIRE);
		this.setType2(Types.FLYING);
		this.setBaseHP(78);
		this.setBaseAtk(84);
		this.setBaseDef(78);
		this.setBaseSpAtk(109);
		this.setBaseSpDef(85);
		this.setBaseSpeed(100);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
