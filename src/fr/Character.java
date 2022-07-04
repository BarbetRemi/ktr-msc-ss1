package fr;

public abstract class Character {

	protected int life, agility, strength, wit;
	protected String name, rpgClass;
	
	public Character(String pName) {
		setName(pName);
		setLife(50);
		setAgility(2);
		setStrength(2);
		setWit(2);
		
		setRPGClass("Character");
	}
	
	protected void setRPGClass(String rpgClass) {
		this.rpgClass = rpgClass;
	}
	
	protected String getRPGClass() {
		return rpgClass;
	}
	
	protected void attack(String string) {
		System.out.println("Rrrrrrrrr...");
	}
	

	protected int getLife() {
		return life;
	}

	protected void setLife(int life) {
		this.life = life;
	}

	protected int getAgility() {
		return agility;
	}

	protected void setAgility(int agility) {
		this.agility = agility;
	}

	protected int getStrength() {
		return strength;
	}

	protected void setStrength(int strength) {
		this.strength = strength;
	}

	protected int getWit() {
		return wit;
	}

	protected void setWit(int wit) {
		this.wit = wit;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	
	

}