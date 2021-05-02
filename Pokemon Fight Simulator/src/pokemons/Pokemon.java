package pokemons;

import attacks.Attacks;

/**
 * This is the superclass for all pokemons. It contains all the common variables
 * and methods.
 */
public abstract class Pokemon {

	private Types type;
	private Types type2;
	private Natures nature;
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
	private Attacks[] attacks = new Attacks[4];
	
	// EV Stats
	private int totalEV = 0;
	private int HPEV = 0;
	private int AtkEV = 0;
	private int DefEV = 0;
	private int SpAtkEV = 0;
	private int SpDefEV = 0;
	private int SpeedEV = 0;
	
	// IV Stats
	private int HPIV = 0;
	private int AtkIV = 0;
	private int DefIV = 0;
	private int SpAtkIV = 0;
	private int SpDefIV = 0;
	private int SpeedIV = 0;

	// Base Stats
	private int baseHP;
	private int baseAtk;
	private int baseDef;
	private int baseSpAtk;
	private int baseSpDef;
	private int baseSpeed;

	// Constructors
	public Pokemon() {
	}

	public Pokemon(int level) {
	}

	public Pokemon(String name) {
	}

	public Pokemon(String name, int level) {
	}
	
	protected abstract void initStats();
	
	public void calculateStats() {
		this.setHP(calculateStat(this.getBaseHP(), "HP"));
		this.setAtk(calculateStat(this.getBaseAtk(), "Atk"));
		this.setDef(calculateStat(this.getBaseDef(), "Def"));
		this.setSpAtk(calculateStat(this.getBaseSpAtk(), "SpAtk"));
		this.setSpDef(calculateStat(this.getBaseSpDef(), "SpDef"));
		this.setSpeed(calculateStat(this.getBaseSpeed(), "Speed"));
	}
	
	private int calculateStat(int baseStat, String baseStatName) {
		float nature = 1.0f;
		
		if (this.getNature().getPlus() == baseStatName) {
			nature = 1.1f;
		} else if (this.getNature().getMinus() == baseStatName) {
			nature = 0.9f;
		}
		
		return (int)Math.floor((int)Math.floor((((2*baseStat+this.getIV(baseStatName)+(int)Math.floor(this.getEV(baseStatName)/4))*this.getLevel())/100)+5)*nature);
	}
	
	protected void generateNature() {
		this.setNature(Natures.randomNature());
	}

	public void levelUp() {
		this.setLevel(this.getLevel() + 1);
		
		if (this.getLevel() > 18) {
			
		}
	}

	public void evolve() {}
	
	/**
	 * Used to get a type attack multiplier against
	 * another type. The first parameter is for the
	 * attacker and the second for the pokemon attacked.
	 */
	public static double weakness(Types attacker, Types attacked) {
		double weakness = 1.0;

		// We suppose that type1 is attacking type2
		weakness = Weaknesses.getWeaknessesList()[attacker.getIndex()][attacked.getIndex()];

		return weakness;
	}

	public void generateIVs() {
		this.setHPIV((int)Math.round(Math.random() * 31));
		this.setAtkIV((int)Math.round(Math.random() * 31));
		this.setDefIV((int)Math.round(Math.random() * 31));
		this.setSpAtkIV((int)Math.round(Math.random() * 31));
		this.setSpDefIV((int)Math.round(Math.random() * 31));
		this.setSpeedIV((int)Math.round(Math.random() * 31));
	}

	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public Types getType2() {
		return type2;
	}

	public Natures getNature() {
		return nature;
	}

	public void setNature(Natures nature) {
		this.nature = nature;
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

	public void setName(String name) {
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

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	public int getDef() {
		return Def;
	}

	public void setDef(int def) {
		Def = def;
	}

	public int getSpAtk() {
		return SpAtk;
	}

	public void setSpAtk(int spAtk) {
		SpAtk = spAtk;
	}

	public int getSpDef() {
		return SpDef;
	}

	public void setSpDef(int spDef) {
		SpDef = spDef;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
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
	
	public int getIV(String IVName) {
		if (IVName.equals("HP")) {
			return this.getHPIV();
		} else if (IVName.equals("Atk")) {
			return this.getAtkIV();
		} else if (IVName.equals("Def")) {
			return this.getDefIV();
		} else if (IVName.equals("SpAtk")) {
			return this.getSpAtkIV();
		} else if (IVName.equals("SpDef")) {
			return this.getSpDefIV();
		} else if (IVName.equals("Speed")) {
			return this.getSpeedIV();
		} else {
			return -1;
		}
	}

	protected int getHPIV() {
		return HPIV;
	}

	protected void setHPIV(int hPIV) {
		this.HPIV = hPIV;
	}

	protected int getAtkIV() {
		return AtkIV;
	}

	protected void setAtkIV(int atkIV) {
		this.AtkIV = atkIV;
	}

	protected int getDefIV() {
		return DefIV;
	}

	protected void setDefIV(int defIV) {
		this.DefIV = defIV;
	}

	protected int getSpAtkIV() {
		return SpAtkIV;
	}

	protected void setSpAtkIV(int spAtkIV) {
		this.SpAtkIV = spAtkIV;
	}

	protected int getSpDefIV() {
		return SpDefIV;
	}

	protected void setSpDefIV(int spDefIV) {
		this.SpDefIV = spDefIV;
	}

	protected int getSpeedIV() {
		return SpeedIV;
	}

	protected void setSpeedIV(int speedIV) {
		this.SpeedIV = speedIV;
	}

	public int getTotalEV() {
		return totalEV;
	}
	
	public int getEV(String EVName) {
		if (EVName == "HP") {
			return this.getHPEV();
		} else if (EVName.equals("Atk")) {
			return this.getAtkEV();
		} else if (EVName.equals("Def")) {
			return this.getDefEV();
		} else if (EVName.equals("SpAtk")) {
			return this.getSpAtkEV();
		} else if (EVName.equals("SpDef")) {
			return this.getSpDefEV();
		} else if (EVName.equals("Speed")) {
			return this.getSpeedEV();
		} else {
			return -1;
		}
	}

	public void refreshTotalEV() {
		this.totalEV = this.getHPEV() + this.getAtkEV() + this.getDefEV() + this.getSpAtkEV() + this.getSpDefEV() + this.getSpeedEV();
	}

	public int getHPEV() {
		return HPEV;
	}

	public void setHPEV(int HPEV) {
		if (HPEV > this.getHPEV()) {
			if (this.getTotalEV() < 512) {
				if (this.getTotalEV() + HPEV > 512) {
					System.out.println("Cannot fully add " + (HPEV - this.getTotalEV()) + ".\nIt would be grater than 512!\nStill adding " + (512 - this.getTotalEV()));
					this.HPEV = HPEV - (512 - this.getTotalEV());
				} else {
					if (this.getHPEV() < 255) {
						if (this.getHPEV() + HPEV <= 255) {
							System.out.println("Successfully added " + (HPEV - this.getHPEV()) + " HP EVs to " + this.getName() + ".\nIt now has " + HPEV + " HP EVs and " + this.getTotalEV() + " Total EVs.");
							this.HPEV = HPEV;
						} else {
							System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (HPEV - this.getHPEV()) + " HP EVs but it would be grater than 255!");
						}
						System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (HPEV - this.getHPEV()) + " HP EVs while already having a total of 255 HP EVs!");
					}
				}
			} else {
				System.out.println("Cannot fully add " + (HPEV - this.getHPEV()) + ".\nIt would be grater than 255!\nStill adding " + (255 - this.getHPEV()));
				this.HPEV = HPEV - (255 - this.getHPEV());
			}
		} else {
			System.out.println("Successfully removed " + (this.getHPEV() - HPEV) + " HP EVs to " + this.getName() + ".\nIt now has " + HPEV + " HP EVs and " + this.getTotalEV() + " Total EVs.");
			this.HPEV = HPEV;
		}
		this.refreshTotalEV();
	}

	public int getAtkEV() {
		return AtkEV;
	}

	public void setAtkEV(int atkEV) {
		if (atkEV > this.getAtkEV()) {
			if (this.getTotalEV() < 512) {
				if (this.getTotalEV() + atkEV > 512) {
					System.out.println("Cannot fully add " + (atkEV - this.getTotalEV()) + ".\nIt would be grater than 512!\nStill adding " + (512 - this.getTotalEV()));
					this.AtkEV = atkEV - (512 - this.getTotalEV());
				} else {
					if (this.getAtkEV() < 255) {
						if (this.getAtkEV() + AtkEV <= 255) {
							System.out.println("Successfully added " + (atkEV - this.getAtkEV()) + " Atk EVs to " + this.getName() + ".\nIt now has " + atkEV + " Atk EVs and " + this.getTotalEV() + " Total EVs.");
							this.AtkEV = atkEV;
						} else {
							System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (atkEV - this.getAtkEV()) + " Atk EVs but it would be grater than 255!");
						}
						System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (atkEV - this.getAtkEV()) + " Atk EVs while already having a total of 255 Atk EVs!");
					}
				}
			} else {
				System.out.println("Cannot fully add " + (atkEV - this.getAtkEV()) + ".\nIt would be grater than 255!\nStill adding " + (255 - this.getAtkEV()));
				this.AtkEV = atkEV - (255 - this.getAtkEV());
			}
		} else {
			System.out.println("Successfully removed " + (this.getAtkEV() - atkEV) + " Atk EVs to " + this.getName() + ".\nIt now has " + atkEV + " Atk EVs and " + this.getTotalEV() + " Total EVs.");
			this.AtkEV = atkEV;
		}
		this.refreshTotalEV();
	}

	public int getDefEV() {
		return DefEV;
	}

	public void setDefEV(int defEV) {
		if (defEV > this.getDefEV()) {
			if (this.getTotalEV() < 512) {
				if (this.getTotalEV() + defEV > 512) {
					System.out.println("Cannot fully add " + (defEV - this.getTotalEV()) + ".\nIt would be grater than 512!\nStill adding " + (512 - this.getTotalEV()));
					this.DefEV = defEV - (512 - this.getTotalEV());
				} else {
					if (this.getDefEV() < 255) {
						if (this.getDefEV() + defEV <= 255) {
							System.out.println("Successfully added " + (defEV - this.getDefEV()) + " Def EVs to " + this.getName() + ".\nIt now has " + defEV + " Def EVs and " + this.getTotalEV() + " Total EVs.");
							this.DefEV = defEV;
						} else {
							System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (defEV - this.getDefEV()) + " Def EVs but it would be grater than 255!");
						}
						System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (defEV - this.getDefEV()) + " Def EVs while already having a total of 255 Def EVs!");
					}
				}
			} else {
				System.out.println("Cannot fully add " + (defEV - this.getDefEV()) + ".\nIt would be grater than 255!\nStill adding " + (255 - this.getDefEV()));
				this.DefEV = defEV - (255 - this.getDefEV());
			}
		} else {
			System.out.println("Successfully removed " + (this.getDefEV() - defEV) + " Def EVs to " + this.getName() + ".\nIt now has " + defEV + " Def EVs and " + this.getTotalEV() + " Total EVs.");
			this.DefEV = defEV;
		}
		this.refreshTotalEV();
	}

	public int getSpAtkEV() {
		return SpAtkEV;
	}

	public void setSpAtkEV(int spAtkEV) {
		if (spAtkEV > this.getSpAtkEV()) {
			if (this.getTotalEV() < 512) {
				if (this.getTotalEV() + spAtkEV > 512) {
					System.out.println("Cannot fully add " + (spAtkEV - this.getTotalEV()) + ".\nIt would be grater than 512!\nStill adding " + (512 - this.getTotalEV()));
					this.SpAtkEV = spAtkEV - (512 - this.getTotalEV());
				} else {
					if (this.getSpAtkEV() < 255) {
						if (this.getSpAtkEV() + spAtkEV <= 255) {
							System.out.println("Successfully added " + (spAtkEV - this.getSpAtkEV()) + " SpAtk EVs to " + this.getName() + ".\nIt now has " + spAtkEV + " SpAtk EVs and " + this.getTotalEV() + " Total EVs.");
							this.SpAtkEV = spAtkEV;
						} else {
							System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (spAtkEV - this.getSpAtkEV()) + " SpAtk EVs but it would be grater than 255!");
						}
						System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (spAtkEV - this.getSpAtkEV()) + " SpAtk EVs while already having a total of 255 SpAtk EVs!");
					}
				}
			} else {
				System.out.println("Cannot fully add " + (spAtkEV - this.getSpAtkEV()) + ".\nIt would be grater than 255!\nStill adding " + (255 - this.getSpAtkEV()));
				this.SpAtkEV = spAtkEV - (255 - this.getSpAtkEV());
			}
		} else {
			System.out.println("Successfully removed " + (this.getSpAtkEV() - spAtkEV) + " SpAtk EVs to " + this.getName() + ".\nIt now has " + spAtkEV + " SpAtk EVs and " + this.getTotalEV() + " Total EVs.");
			this.SpAtkEV = spAtkEV;
		}
		this.refreshTotalEV();
	}

	public int getSpDefEV() {
		return SpDefEV;
	}

	public void setSpDefEV(int spDefEV) {
		if (spDefEV > this.getSpDefEV()) {
			if (this.getTotalEV() < 512) {
				if (this.getTotalEV() + spDefEV > 512) {
					System.out.println("Cannot fully add " + (spDefEV - this.getTotalEV()) + ".\nIt would be grater than 512!\nStill adding " + (512 - this.getTotalEV()));
					this.SpDefEV = spDefEV - (512 - this.getTotalEV());
				} else {
					if (this.getSpDefEV() < 255) {
						if (this.getSpDefEV() + spDefEV <= 255) {
							System.out.println("Successfully added " + (spDefEV - this.getSpDefEV()) + " SpDef EVs to " + this.getName() + ".\nIt now has " + spDefEV + " SpDef EVs and " + this.getTotalEV() + " Total EVs.");
							this.SpDefEV = spDefEV;
						} else {
							System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (spDefEV - this.getSpDefEV()) + " SpDef EVs but it would be grater than 255!");
						}
						System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (spDefEV - this.getSpDefEV()) + " SpDef EVs while already having a total of 255 SpDef EVs!");
					}
				}
			} else {
				System.out.println("Cannot fully add " + (spDefEV - this.getSpDefEV()) + ".\nIt would be grater than 255!\nStill adding " + (255 - this.getSpDefEV()));
				this.SpDefEV = spDefEV - (255 - this.getSpDefEV());
			}
		} else {
			System.out.println("Successfully removed " + (this.getSpDefEV() - spDefEV) + " SpDef EVs to " + this.getName() + ".\nIt now has " + spDefEV + " SpDef EVs and " + this.getTotalEV() + " Total EVs.");
			this.SpDefEV = spDefEV;
		}
		this.refreshTotalEV();
	}

	public int getSpeedEV() {
		return SpeedEV;
	}

	public void setSpeedEV(int speedEV) {
		if (speedEV > this.getSpeedEV()) {
			if (this.getTotalEV() < 512) {
				if (this.getTotalEV() + speedEV > 512) {
					System.out.println("Cannot fully add " + (speedEV - this.getTotalEV()) + ".\nIt would be grater than 512!\nStill adding " + (512 - this.getTotalEV()));
					this.SpeedEV = speedEV - (512 - this.getTotalEV());
					} else {
					if (this.getSpeedEV() < 255) {
						if (this.getSpeedEV() + speedEV <= 255) {
							System.out.println("Successfully added " + (speedEV - this.getSpeedEV()) + " Speed EVs to " + this.getName() + ".\nIt now has " + speedEV + " Speed EVs and " + this.getTotalEV() + " Total EVs.");
							this.SpeedEV = speedEV;
						} else {
							System.out.println("Cannot fully add " + (speedEV - this.getSpeedEV()) + ".\nIt would be grater than 255!\nStill adding " + (255 - this.getSpeedEV()));
							this.SpeedEV = speedEV - (255 - this.getSpeedEV());
						}
						System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\n Trying to add " + (speedEV - this.getSpeedEV()) + " Speed EVs while already having a total of 255 Speed EVs!");
					}
				}
			} else {
				System.err.println("Incorrect operation with " + this.getName() + "'s EVs.\nTrying to add " + speedEV + " Speed EVs while having a total of " + this.getTotalEV() + " EVs.\nThe latter mustn't be greater than 512!");
			}
		} else {
			System.out.println("Successfully removed " + (this.getSpeedEV() - speedEV) + " Speed EVs to " + this.getName() + ".\nIt now has " + speedEV + " Speed EVs and " + this.getTotalEV() + " Total EVs.");
			this.SpeedEV = speedEV;
		}
		this.refreshTotalEV();
	}
	
	public Attacks[] getAttacks() {
		return attacks;
	}

	protected void setAttacks(Attacks attack, int index) {
		this.attacks[index] = attack;
	}

	public void addAttack(Attacks attack) {
		if (this.getAttacks().length < 4) {
			this.getAttacks()[this.getAttacks().length] = attack;
		} else {
			this.setAttacks(attack, 3);
		}
	}
	public void describe() {
		System.out.println(this.getHP() + "\n" + this.getAtk() + "\n" + this.getDef() + "\n" + this.getSpAtk() + "\n" + this.getSpDef() + "\n" + this.getSpeed() + "\n" + this.getNature() + "\n" + this.getType() + "\n" + this.getType2() + "\n" + this.getName());
	}
	
}
