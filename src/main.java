package src;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);

		//Create Menu
		//welcome menu
		welcome();
		//Main Menu
		//System.out.println(mainMenu(sc));

		//Coffee Menu
		coffeeMenu();
		// coffee details


	}
	public static void welcome(){
		System.out.println("Welcome, What can I get started for you");
	}

	/**
	 * main menu will add tr
	 * @param sc
	 * @return
	 */
	public static int mainMenu(Scanner sc){
		int menuItem = 0;
		System.out.println("1. Order Coffee \n2. Check Balance \n3. Check Inventory\n4. to Exit \n");
		menuItem = sc.nextInt();
		//System.out.println("You choose "+ menuItem + " correct? (y/n)\n");
		System.out.println("is " + menuItem +" correct");
		return menuItem;

//		try{
//			while(menuItem != 1 || menuItem != 2 || menuItem != 3){
//				if(sc.next)
//			}
//
//			return menuItem;
//		} catch (Exception e) {
//			System.out.println("Please choose from the menu");
//			return mainMenu(sc);
//		}

	}
	public static void coffeeMenu(){
		int n =1;
		String[] coffeeMenu = {
				"1. Espresso \n2. Latte \n3. Cappuccino\n4. Coffee",
				"Espresso \nTakes:\n250ml of Water \n16g Coffee Beans\n$4",
				"Lattee \nTakes:\n350ml of Water\n75ml of Milk \n20g Coffee Beans\n$7",
				"Cappuccino \nTakes:\n200ml of Water\n100ml of Milk \n12g Coffee Beans\n$6",
				"Coffee \nTakes:\n200ml of Water\n50ml of Milk \n15g Coffee Beans\n$1"
		};
		//List of Coffee Drinks
		System.out.println(coffeeMenu[0]);
		switch (n){
			case 1:
				//Espresso water = 250, coffee beans =  16 cost =  $4
				System.out.println(coffeeMenu[1]);
			break;
			case 2:
				//latte, water = 350 ml , milk 75 ml,  beans = 20 g, costs $7
				System.out.println(coffeeMenu[2]);
			break;
			case 3:
				//cappuccino, water = 200 ml, milk = 100 ml, beans = 12 g . It costs $6
				System.out.println(coffeeMenu[3]);
			break;
			case 4:
				//coffee, water = 200, milk = 50, beans = 15 cost = 1
				System.out.println(coffeeMenu[4]);
			break;
			default:
				for ( String str: coffeeMenu)
				{
					System.out.println(str);
				}

		}


	}



}
