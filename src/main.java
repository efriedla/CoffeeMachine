package src;

/**
 * Coffe Machine program will be able to make several types of coffee drinks
 * hold ingrediance
 * take payment
 *
 */
public class main {

	public static void main(String[] args) {
		//Stage 1
		//coffeeProcess();

		//Stage 2
		coffeeDrinksIngredianeNeeded(25);
	}

	/**
	 * Stage 1: print out coffee process
	 */
	public static void coffeeProcess(){
		System.out.println("Starting to make a coffee\n" +
				"\n" +
				"Grinding coffee beans\n" +
				"\n" +
				"Boiling water\n" +
				"\n" +
				"Mixing boiled water with crushed coffee beans\n" +
				"\n" +
				"Pouring coffee into the cup\n" +
				"\n" +
				"Pouring some milk into the cup\n" +
				"\n" +
				"Coffee is ready!");
	}

	/**
	 * Displays how much of each ingrediant need to max the mount of cups of coffee
	 * @param cups
	 */
	public static void coffeeDrinksIngredianeNeeded(int cups){
		System.out.println("For " + cups + " Cups of coffee you will need");
		final int coffeeBeansNeeded = 15;//g
		final int coffeeMilkNeeded = 50;//ml
		final int coffeeWaterNeeded = 200; //ml
		//200 ml of water, 50 ml of milk, and 15 g of coffee beans.
		System.out.println("Milk needed " + cups * coffeeMilkNeeded);
		System.out.println("Water needed " + cups * coffeeWaterNeeded);
		System.out.println("Beans needed " + cups * coffeeBeansNeeded);

	}
}
