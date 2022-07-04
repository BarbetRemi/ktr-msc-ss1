package exceptions;

public class Warrior extends Character {

	public Warrior(String pName) {
	
		super(pName);
		
		setLife(100);
		setAgility(8);
		setStrength(10);
		setWit(3);
		
		setRPGClass("Warrior");
		
		System.out.println("["+ getName() +"]: My name will go down in history !");
	}
	
	@Override
	public void moveRight() {
		System.out.println("["+ getName() +"] moves right like a bad boy.");
		
	}
	@Override
	public void moveLeft() {
		System.out.println("["+ getName() +"] moves left like a bad boy.");
		
	}
	@Override
	public void moveForward() {
		System.out.println("["+ getName() +"] moves back like a bad boy.");
		
	}
	@Override
	public void moveBack() {
		System.out.println("["+ getName() +"] moves forward like a bad boy.");
		
	}

	public void tryToAttack(String pWeapon) throws WeaponException {
		switch(pWeapon)
		{
		   	case "":
		   		System.out.println("["+ getName() +"]: "); throw new WeaponException();
		   		
		   	case "hammer" :
			case "sword" :
			    attack(pWeapon);
		        break;
		   
		    default : 
			    System.out.println("["+ getName() +"]: I don 't need this stupid "+ pWeapon +"! Don 't misjudge my powers!");
		   	
		}
	}
	
	
	public void attack(String pWeapon) {
		super.attack(pWeapon);
		
		System.out.println("["+ getName() +"]: I'll crush you with my "+ pWeapon +"!");
	}
	
}
