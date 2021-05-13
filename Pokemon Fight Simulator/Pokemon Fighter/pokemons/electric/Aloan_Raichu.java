package pokemons.electric;

import pokemons.Natures;
import pokemons.Types;

public class Aloan_Raichu extends Pikachu {
	
public Aloan_Raichu() {
		
		this.setName("Raichu");
		this.generateIVs();
		initStats();
		
	}
	
	public Aloan_Raichu(int level) {
		
		this.setName("Raichu");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Aloan_Raichu(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Aloan_Raichu(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.ELECTRIC);
		this.setType2(Types.PSYCHIC);
		this.setBaseHP(60);
		this.setBaseAtk(85);
		this.setBaseDef(50);
		this.setBaseSpAtk(95);
		this.setBaseSpDef(85);
		this.setBaseSpeed(110);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
	
}
