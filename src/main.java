package src;

/**
 * Coffe Machine program will be able to make several types of coffee drinks
 * hold ingrediance
 * take payment
 *
 */
public class main {


	public static void main(String[] args) {

		//stage 4
		CoffeeMachine order1 = new CoffeeMachine(2, 2);

		//Create Menu
		//welcome menu
		System.out.println("Welcome, What can I get started for you");
		//Main Menu
		System.out.println("1. Order Coffee \n2. Check Balance \n3. Check Inventory");
		//Coffee Menu
		System.out.println("1. Espresso \n2. Latte \n3. Cappuccino\n4. Coffee");
		// coffee details
		//Espresso water = 250, coffee beans =  16 cost =  $4
		System.out.println("1. Espresso \nTakes:\n250ml of Water \n16g Coffee Beans\n$4");
		//latte, water = 350 ml , milk 75 ml,  beans = 20 g, costs $7
		System.out.println("2. Lattee \nTakes:\n350ml of Water\n75ml of Milk \n20g Coffee Beans\n$7");
		//cappuccino, water = 200 ml, milk = 100 ml, beans = 12 g . It costs $6
		System.out.println("3. Cappuccino \nTakes:\n200ml of Water\n100ml of Milk \n12g Coffee Beans\n$6");
		//coffee, water = 200, milk = 50, beans = 15 cost = 1
		System.out.println("4. Coffee \nTakes:\n200ml of Water\n50ml of Milk \n15g Coffee Beans\n$1");
	}



}
