package fr;

public class Mage extends Character {

	public Mage(String pName) {
		
		super(pName);

		setLife(70);
		setAgility(10);
		setStrength(3);
		setWit(10);
		
		setRPGClass("Mage");
		
		System.out.println("["+ getName() +"]: May the gods be with me.");
	}
	
	@Override
	public void moveRight() {
		System.out.println("["+ getName() +"] moves right furtively.");
		
	}
	@Override
	public void moveLeft() {
		System.out.println("["+ getName() +"] moves left furtively.");
		
	}
	@Override
	public void moveForward() {
		System.out.println("["+ getName() +"] moves back furtively.");
		
	}
	@Override
	public void moveBack() {
		System.out.println("["+ getName() +"] moves forward furtively.");
		
	}
	
	public void attack(String pWeapon) {
		super.attack(pWeapon);
		
		switch(pWeapon)
		{
		   case "magic" :
		   case "wand" :
			  System.out.println("["+ getName() +"]: Feel the power of my "+ pWeapon +"!");
		      break;
		   
		   default : 
			  System.out.println("["+ getName() +"]: Nothing happens!");
		}

		
	}
	

}
