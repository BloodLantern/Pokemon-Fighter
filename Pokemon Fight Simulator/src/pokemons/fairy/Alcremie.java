package pokemons.fairy;

import pokemons.Natures;
import pokemons.Pokemon;
import pokemons.Types;

public class Alcremie extends Milcery {

public Alcremie() {
		
		this.setName("Alcremie");
		this.generateIVs();
		initStats();
		
	}
	
	public Alcremie(int level) {
		
		this.setName("Alcremie");
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	public Alcremie(String name) {
		
		this.setName(name);
		this.generateIVs();
		initStats();
		
	}
	
	public Alcremie(String name, int level) {
		
		this.setName(name);
		this.setLevel(level);
		this.generateIVs();
		initStats();
		
	}
	
	@Override
	protected void initStats() {
		this.setType(Types.FAIRY);
		this.setBaseHP(65);
		this.setBaseAtk(60);
		this.setBaseDef(75);
		this.setBaseSpAtk(110);
		this.setBaseSpDef(121);
		this.setBaseSpeed(64);
		this.setNature(Natures.randomNature());
		this.calculateStats();
	}
}
