package pokemons.electric;

import pokemons.Natures;
import pokemons.Types;

public final class Raichu extends Pikachu {
	
public Raichu() {
		
		this.setName("Raichu");
		this.generateIVs();
		initStats();
		
	}
	
	public Raichu(int level) {
		
		this.setName("Raichu");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Raichu(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Raichu(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.ELECTRIC);
		this.setBaseHP(60);
		this.setBaseAtk(90);
		this.setBaseDef(55);
		this.setBaseSpAtk(90);
		this.setBaseSpDef(80);
		this.setBaseSpeed(110);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
	
}
