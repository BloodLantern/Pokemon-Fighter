package pokemons;

public abstract class Pokemon {
	
	private Types type;
	private Types type2;
	private String name;
	private int level = 1;
	private int HP;
	private int Atk;
	private int Def;
	private int SpAtk;
	private int SpDef;
	private int Speed;
	
	public Pokemon() {}
	
	public void levelUp() {}
	
	public void evolve() {}

	public Types getType() {
		return type;
	}

	protected void setType(Types type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	protected void setLevel(int level) {
		this.level = level;
	}

	public int getHP() {
		return HP;
	}

	protected void setHP(int hP) {
		HP = hP;
	}

	public int getAtk() {
		return Atk;
	}

	protected void setAtk(int atk) {
		Atk = atk;
	}

	public int getDef() {
		return Def;
	}

	protected void setDef(int def) {
		Def = def;
	}

	public int getSpAtk() {
		return SpAtk;
	}

	protected void setSpAtk(int spAtk) {
		SpAtk = spAtk;
	}

	public int getSpDef() {
		return SpDef;
	}

	protected void setSpDef(int spDef) {
		SpDef = spDef;
	}

	public int getSpeed() {
		return Speed;
	}

	protected void setSpeed(int speed) {
		Speed = speed;
	}
	
}
