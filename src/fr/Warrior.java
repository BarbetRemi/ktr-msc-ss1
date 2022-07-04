package fr;

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

	public void attack(String pWeapon) {
		super.attack(pWeapon);
		
		switch(pWeapon)
		{
		   case "hammer" :
		   case "sword" :
			  System.out.println("["+ getName() +"]: I'll crush you with my "+ pWeapon +"!");
		      break;
		   
		   default : 
			  System.out.println("["+ getName() +"]: Nothing happens!");
		}

		
	}
	
}
