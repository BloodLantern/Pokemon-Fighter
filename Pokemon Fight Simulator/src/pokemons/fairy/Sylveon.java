package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;
import pokemons.normal.Eevee;

public class Sylveon extends Eevee {

public Sylveon() {
		
		this.setName("Sylveon");
		this.generateIVs();
		initStats();
		
	}
	
	public Sylveon(int level) {
		
		this.setName("Sylveon");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Sylveon(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Sylveon(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(95);
		this.setBaseAtk(65);
		this.setBaseDef(65);
		this.setBaseSpAtk(110);
		this.setBaseSpDef(130);
		this.setBaseSpeed(60);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
