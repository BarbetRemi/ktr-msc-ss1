package exceptions;

public class Main {

	public static void main(String[] args) throws WeaponException {
		
		Character warrior = new Warrior ("Jean-Luc");
		Character mage = new Mage ("Robert");
		
		warrior.tryToAttack("screwdriver");
		mage.tryToAttack("hammer");
		warrior.tryToAttack("hammer");
		
		try {
			mage.attack("");
		} catch (WeaponException e) {
			System.out.println(e.getMessage());
		}

	}

}
