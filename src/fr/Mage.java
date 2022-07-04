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
