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
	int waterNeeded; //ml
	int cost = 1;


	CoffeeMachine(int cups, int coffeeType ){
		this.cupsToMake = cups;
		drinkTypeInstructions(coffeeType);
		canMake();

	}

	//Determine drink
	public void drinkTypeInstructions(int coffeeType){
		switch (coffeeType){
			case 1:
				// espresso, water = 250, coffee beans =  16 cost =  $4
				waterNeeded = 250;
				beansNeeded = 16;
				milkNeeded = 0;
				cost = 4;
				this.coffeeType = coffeeType;
				System.out.println("Espresso");
				break;
			case 2:
				// latte, water = 350 ml , milk 75 ml,  beans = 20 g, costs $7
				waterNeeded = 350;
				beansNeeded = 20;
				milkNeeded = 75;
				cost = 7;
				this.coffeeType = coffeeType;
				System.out.println("Latte");
				break;
			case 3:
				// cappuccino, water = 200 ml, milk = 100 ml, beans = 12 g . It costs $6
				waterNeeded = 200;
				beansNeeded = 12;
				milkNeeded = 100;
				cost = 6;
				this.coffeeType = coffeeType;
				System.out.println("Cappuccino");
				break;
			default:
				// coffee, water = 200, milk = 50, beans = 15 cost = 1
				waterNeeded = 200;
				beansNeeded = 15;
				milkNeeded = 50;
				cost = 1;
				this.coffeeType = coffeeType;
				System.out.println("Coffee");
		}

	}


	// ingrediance by Coffee
	public  int getWater(int cups ){
		return cups * waterNeeded;
	}
	public  int getMilk(int cups){
		return cups * milkNeeded;
	}
	public  int getBeans(int cups){
		return cups * beansNeeded;
	}

	// Set ingrediance Inventory
	public  void setWaterInventory(int cupsMade ){
		 this.waterInventory -= getWater(cupsMade);
	}
	public  void setMilkInventory(int cupsMade){
		this.milkInventory -= getMilk(cupsMade);
	}
	public  void setBeansInventory(int cupsMade){
		this.beanInventory -= getBeans(cupsMade);
	}


	public void canMake(){
		while(this.waterInventoryLeft && this.milkInventoryLeft && this.beansInventoryLeft && disposableCupsLeft && cupsMade <= cupsToMake){
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
			//set inventory
			setWaterInventory(cupsMade);
			setMilkInventory(cupsMade);
			setBeansInventory(cupsMade);
			System.out.println("Yes, I can make that amount of coffee " + cupsMade + "\nWater inventory" +
					" " + waterInventory);
			System.out.println("Milk inventory " + milkInventory);
			System.out.println("Bean inventory " + beanInventory);

		}
	}



}
