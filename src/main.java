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
//		coffeeDrinksIngredianeNeeded(25);

		//Stage 3
//		ableToMakeCoffee(3);

		//stage 3.5
		CoffeeMachine order1 = new CoffeeMachine(2);
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
	public static int getWater(int cups){
		return cups * 200;
	}
	public static int getMilk(int cups){
		return cups * 50;
	}
	public static int getBeans(int cups){
		return cups * 15;
	}

	public static void ableToMakeCoffee(int cups){
		int waterInventory = 400;
		int beanInventory = 15;
		int milkInventory = 50;
		int cupsMade = 0;


		boolean waterInventoryLeft = true;
		boolean milkInventoryLeft = true;
		boolean beansInventoryLeft = true;


		while(waterInventoryLeft && milkInventoryLeft && beansInventoryLeft){
			cupsMade ++;
			waterInventoryLeft = (waterInventory - getWater(cupsMade) >= 0) ? true:false;
			milkInventoryLeft = (milkInventory - getMilk(cupsMade) >= 0) ? true:false;
			beansInventoryLeft = (beanInventory - getBeans(cupsMade) >= 0) ? true:false;

		}
		//System.out.println(cupsMade -= 1);
		if(cupsMade < cups ){
			System.out.println("No, I can make only "+ cupsMade +" cups of coffee");
		}else{
			System.out.println("Yes, I can make that amount of coffee");
		}



	}
}
