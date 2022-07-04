package exceptions;

public abstract class Character implements Movable {

	protected int life, agility, strength, wit;
	protected String name, rpgClass;
	protected Boolean isWeapSheathed = true;
	
	public Character(String pName) {
		setName(pName);
		
		setLife(50);
		setAgility(2);
		setStrength(2);
		setWit(2);
		
		setRPGClass("Character");
		
	}
	
	protected void tryToAttack(String pWeapon) throws WeaponException {}
	
	private void unSheathe() {
		setIsWeapSheathed(false);
		System.out.println("["+ getName() +"]: unsheathes his weapon.");
	}
	
	@Override
	public void moveRight() {
		System.out.println("["+ getName() +"] moves right");
		
	}
	@Override
	public void moveLeft() {
		System.out.println("["+ getName() +"] moves left");
		
	}
	@Override
	public void moveForward() {
		System.out.println("["+ getName() +"] moves back");
		
	}
	@Override
	public void moveBack() {
		System.out.println("["+ getName() +"] moves forward");
		
	}
	
	protected void setRPGClass(String rpgClass) {
		this.rpgClass = rpgClass;
	}
	
	protected String getRPGClass() {
		return rpgClass;
	}
	
	protected void attack(String pWeapon) {
		System.out.println("["+ getName() +"]: Rrrrrrrrr...");
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

	protected Boolean getIsWeapSheathed() {
		return isWeapSheathed;
	}

	protected void setIsWeapSheathed(Boolean isWeapSheathed) {
		this.isWeapSheathed = isWeapSheathed;
	}

	
	

}
