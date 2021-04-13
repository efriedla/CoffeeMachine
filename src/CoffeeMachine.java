package src;


public class CoffeeMachine {
	//inventory
	int waterInventory = 1200;
	int beanInventory = 120;
	int milkInventory = 540;
	int disposableCups = 9;
	int balnace = 550;

	int cupsMade = 0;
	int cupsToMake;
	int coffeeType;  // 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2
	//function
	boolean waterInventoryLeft = true;
	boolean milkInventoryLeft = true;
	boolean beansInventoryLeft = true;
	boolean disposableCupsLeft = true;

	//coffee recipe
	int beansNeeded = 15;//g
	int milkNeeded = 50;//ml
	int waterNeeded = 200; //ml
	int cost = 1;


	CoffeeMachine(int cups){
		this.cupsToMake = cups;
		canMake();
	}

	//Determine drink
	public static void DrinkTypeInstructions(){
		// espresso, water = 250, coffee beans =  16 cost =  $4
		// latte, water = 350 ml , milk 75 ml,  beans = 20 g, costs $7
		// cappuccino, water = 200 ml, milk = 100 ml, beans = 12 g . It costs $6
		// coffee, water = 200, milk = 50, beans = 15 cost = 1

	}


	// ingrediance by Coffee
	public  int getWater(int cups ){
		return cups * this.waterNeeded;
	}
	public  int getMilk(int cups){
		return cups * this.milkNeeded;
	}
	public  int getBeans(int cups){
		return cups * this.beansNeeded;
	}


	public void canMake(){
		while(this.waterInventoryLeft && this.milkInventoryLeft && this.beansInventoryLeft && disposableCupsLeft ){
			this.cupsMade ++;
			this.waterInventoryLeft = (this.waterInventory - getWater(this.cupsMade) >= 0) ? true:false;
			this.milkInventoryLeft = (this.milkInventory - getMilk(this.cupsMade) >= 0) ? true:false;
			this.beansInventoryLeft = (this.beanInventory - getBeans(this.cupsMade) >= 0) ? true:false;
			disposableCupsLeft = (disposableCups - cupsMade >= 0) ? true:false;
		}
		cupsMade -= 1;
		if(cupsMade < cupsToMake ){
			System.out.println("No, I can make only "+ cupsMade +" cups of coffee");
		}else{
			System.out.println("Yes, I can make that amount of coffee");
		}
	}



}
