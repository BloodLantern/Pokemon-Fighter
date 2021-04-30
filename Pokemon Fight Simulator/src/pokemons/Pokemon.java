package pokemons;

/**
 * This is the superclass for all
 * pokemons. It contains all the
 * common variables and methods.
 */
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
	private int experience = 0;
	private int accuracy = 100;
	private int dodge = 0;
	
	// Base stats
	private int baseHP;
	private int baseAtk;
	private int baseDef;
	private int baseSpAtk;
	private int baseSpDef;
	private int baseSpeed;
	
	private double[] BUG = {
			1.0, 2.0, 1.0, 1.0,
			0.5, 1.0, 0.5, 1.0,
			0.5, 2.0, 1.0, 1.0,
			2.0, 1.0, 1.0, 1.0,
			1.0, 1.0
	};
	private double[] DARK = {
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0, 2.0, 1.0,
			1.0, 1.0, 0.0, 2.0,
			1.0, 0.5, 1.0, 0.5,
			1.0, 2.0
	};
	private double[] DRAGON = {
			1.0, 0.5, 0.5, 0.5,
			0.5, 2.0, 1.0, 1.0,
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0, 2.0, 1.0,
			1.0, 2.0
	};
	private double[] ELECTRIC = {
			1.0, 1.0, 1.0, 0.5,
			1.0, 1.0, 1.0, 1.0,
			2.0, 0.5, 1.0, 1.0,
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0
	};
	private double[] FAIRY = {
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0, 0.5, 2.0,
			1.0, 1.0, 1.0, 0.5,
			1.0, 1.0, 0.0, 0.5,
			2.0, 1.0
	};
	private double[] FIGHTING = {
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0, 1.0, 1.0,
			1.0, 2.0, 2.0, 0.5,
			0.5, 1.0, 1.0, 0.5,
			1.0, 2.0
	};
	private double[] FIRE = {
			1.0, 0.5, 2.0, 1.0,
			0.5, 0.5, 1.0, 1.0,
			2.0, 1.0, 1.0, 0.5,
			2.0, 1.0, 1.0, 1.0,
			0.5, 0.5
	};
	private double[] FLYING = {
			1.0, 1.0, 1.0, 2.0,
			0.5, 2.0, 0.5, 1.0,
			0.0, 1.0, 1.0, 0.5,
			2.0, 1.0, 1.0, 1.0,
			1.0, 1.0
	};
	private double[] GHOST = {
			0.0, 1.0, 1.0, 1.0,
			1.0, 1.0, 0.0, 0.5,
			1.0, 1.0, 1.0, 0.5,
			1.0, 2.0, 1.0, 2.0,
			1.0, 1.0
	};
	private double[] GRASS = {
			1.0, 2.0, 0.5, 0.5,
			0.5, 2.0, 1.0, 2.0,
			0.5, 2.0, 1.0, 2.0,
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0
	};
	private double[] GROUND = {
			1.0, 1.0, 2.0, 0.0,
			2.0, 2.0, 1.0, 0.5,
			1.0, 1.0, 1.0, 1.0,
			0.5, 1.0, 1.0, 1.0,
			1.0, 1.0
	};
	private double[] ICE = {
			1.0, 2.0, 1.0, 1.0,
			1.0, 0.5, 2.0, 1.0,
			1.0, 1.0, 1.0, 1.0,
			2.0, 1.0, 1.0, 1.0,
			2.0, 1.0
	};
	private double[] NORMAL = {
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0, 2.0, 1.0,
			1.0, 1.0, 1.0, 1.0,
			1.0, 0.0, 1.0, 1.0,
			1.0, 1.0
	};
	private double[] POISON = {
			1.0, 1.0, 1.0, 1.0,
			0.5, 1.0, 0.5, 0.5,
			2.0, 1.0, 2.0, 0.5,
			1.0, 1.0, 1.0, 1.0,
			1.0, 0.5
	};
	private double[] PSYCHIC = {
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0, 0.5, 1.0,
			1.0, 1.0, 0.5, 2.0,
			1.0, 2.0, 1.0, 2.0,
			1.0, 1.0
	};
	private double[] ROCK = {
			0.5, 0.5, 2.0, 1.0,
			2.0, 1.0, 2.0, 0.5,
			2.0, 0.5, 1.0, 1.0,
			1.0, 1.0, 1.0, 1.0,
			2.0, 1.0
	};
	private double[] STEEL = {
			0.5, 2.0, 1.0, 1.0,
			0.5, 0.5, 2.0, 0.0,
			2.0, 0.5, 0.5, 0.5,
			0.5, 1.0, 0.5, 1.0,
			0.5, 0.5
	};
	private double[] WATER = {
			1.0, 0.5, 0.5, 2.0,
			2.0, 0.5, 1.0, 1.0,
			1.0, 1.0, 1.0, 1.0,
			1.0, 1.0, 1.0, 1.0,
			0.5, 1.0
	};
	
	private double[][] weaknessesList = {
			NORMAL, FIRE, WATER, ELECTRIC,
			GRASS, ICE, FIGHTING, POISON,
			GROUND, FLYING, PSYCHIC, BUG,
			ROCK, GHOST, DRAGON, DARK,
			STEEL, FAIRY
			};
	
	
	// Constructors
	public Pokemon() {}
	public Pokemon(int level) {}
	public Pokemon(String name) {}
	public Pokemon(String name, int level) {}
	
	public void levelUp() {}
	
	public void evolve() {}
	
	protected double weakness(Types type1, Types type2) {
		double weakness = 1.0;
		
		// We suppose that type1 is attacking type2
		weakness = weaknessesList[type1.getIndex()][type2.getIndex()];
		
		return weakness;
	}
	
	protected int generateIV() {
		return (int)Math.floor(Math.random()*31);
	}

	public Types getType() {
		return type;
	}

	protected void setType(Types type) {
		this.type = type;
	}

	public Types getType2() {
		return type2;
	}

	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public int getDodge() {
		return dodge;
	}
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	public void setType2(Types type2) {
		this.type2 = type2;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
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
	public int getBaseHP() {
		return baseHP;
	}
	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}
	public int getBaseAtk() {
		return baseAtk;
	}
	public void setBaseAtk(int baseAtk) {
		this.baseAtk = baseAtk;
	}
	public int getBaseDef() {
		return baseDef;
	}
	public void setBaseDef(int baseDef) {
		this.baseDef = baseDef;
	}
	public int getBaseSpAtk() {
		return baseSpAtk;
	}
	public void setBaseSpAtk(int baseSpAtk) {
		this.baseSpAtk = baseSpAtk;
	}
	public int getBaseSpDef() {
		return baseSpDef;
	}
	public void setBaseSpDef(int baseSpDef) {
		this.baseSpDef = baseSpDef;
	}
	public int getBaseSpeed() {
		return baseSpeed;
	}
	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}
	
}
