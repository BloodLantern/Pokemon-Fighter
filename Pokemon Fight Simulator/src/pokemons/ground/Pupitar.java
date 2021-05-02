package pokemons.ground;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Pupitar extends Larvitar {

public Pupitar() {
		
		this.setName("Pupitar");
		this.generateIVs();
		initStats();
		
	}
	
	public Pupitar(int level) {
		
		this.setName("Pupitar");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Pupitar(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Pupitar(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.GROUND);
		this.setType2(Types.ROCK);
		this.setBaseHP(70);
		this.setBaseAtk(84);
		this.setBaseDef(70);
		this.setBaseSpAtk(65);
		this.setBaseSpDef(70);
		this.setBaseSpeed(51);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}

}
