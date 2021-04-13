package src;


public class CoffeeMachine {
	//inventory
	int waterInventory = 400;
	int beanInventory = 15;
	int milkInventory = 50;
	int disposableCups = 10;

	int cupsMade = 0;
	int cupsToMake;
	int coffeeType;  // 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2
	//function
	boolean waterInventoryLeft = true;
	boolean milkInventoryLeft = true;
	boolean beansInventoryLeft = true;

	//coffee recipe
	final int coffeeBeansNeeded = 15;//g
	final int coffeeMilkNeeded = 50;//ml
	final int coffeeWaterNeeded = 200; //ml


	CoffeeMachine(int cups){
		this.cupsToMake = cups;
		canMake();
	}


	public static int getWater(int cups ){
		return cups * 200;
	}
	public static int getMilk(int cups){
		return cups * 50;
	}
	public static int getBeans(int cups){
		return cups * 15;
	}

	public void canMake(){
		while(this.waterInventoryLeft && this.milkInventoryLeft && this.beansInventoryLeft){
			this.cupsMade ++;
			this.waterInventoryLeft = (this.waterInventory - getWater(this.cupsMade) >= 0) ? true:false;
			this.milkInventoryLeft = (this.milkInventory - getMilk(this.cupsMade) >= 0) ? true:false;
			this.beansInventoryLeft = (this.beanInventory - getBeans(this.cupsMade) >= 0) ? true:false;
		}
		cupsMade -= 1;
		if(cupsMade < cupsToMake ){
			System.out.println("No, I can make only "+ cupsMade +" cups of coffee");
		}else{
			System.out.println("Yes, I can make that amount of coffee");
		}
	}

}
