# CoffeeMachine
Java Tutorial `https://github.com/seycileli/CoffeeMachine`

### About:
What can be better than a cup of coffee during a break?

A coffee that you don’t have to make yourself. It’s enough to press a couple of buttons on the machine and you get a cup of energy; but first, we should teach the machine how to do it.

In this project, you will work on programming a coffee-machine simulator.

The machine works with quite typical products:

Coffee, milk, sugar, and plastic cups
IF it runs out of something, it shows a notification.

The machine can make three types of coffee: espresso, cappuccino, and latte.

Since nothing’s for free, it also collects the money.

### Result
This project allows you to get a taste of Java. An important part of Java are classes, and this is what you will practice here.

Try yourself at working with loops and conditions and get more confident in Java programming.

https://imgur.com/BuD259h

Stage #1: Hello, coffee!
Write a program that puts basic information on the screen: Give the machine a chance to tell the customers what it’s doing!

### Description:

Let's start with a program that makes you a coffee – virtual coffee, of course.

But in this project, you will implement functionality that simulates a real coffee machine. It can run out of milk, it can run out of coffee beans, it can make different varieties of coffee, and it can take the money for making a coffee.

The first version of the program just makes you a coffee. It prints to the standard output what it is doing as it makes a coffee.

Output example:
Using the "Hello, World!" program, write the program that prints all lines as in the example below.

Starting to make a coffee

Grinding coffee beans

Boiling water

Mixing boiled water with crushed coffee beans

Pouring coffee into the cup

Pouring some milk into the cup

Coffee is ready!

---
## Stage #2: Machines have needs
Program the machine to calculate the amount of ingredients it needs depending on how many people want some coffee.

### Description:

Now let's consider a case where you need a lot of coffee. Maybe, for example, you’re hosting a party with a lot of guests. The program should calculate how much water, coffee beans, and milk are necessary to make the specified amount of coffee. One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.

The user should input the amount of coffee he needs, in cups, for all the guests.

Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.

### Output example
The example below shows how your output might look.

Write how many cups of coffee you will need: 25

For 25 cups of coffee you will need:

5000 ml of water

1250 ml of milk

375 g of coffee beans

OR;

Write how many cups of coffee you will need: 125

For 125 cups of coffee you will need:

25000 ml of water

6250 ml of milk

1875 g of coffee beans

---
## Stage #3: Enough coffee for everyone
Working with conditions, program the machine to estimate how many creamy coffees it can make based on the amount of ingredients we enter.

### Description

A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.

### utput example
The program should firstly request for water, then milk, then beans, then amount of cups.

Write how many ml of water the coffee machine has: 300

Write how many ml of milk the coffee machine has: 65

Write how many grams of coffee beans the coffee machine has: 100

Write how many cups of coffee you will need: 1

Yes, I can make that amount of coffee

OR;

Write how many ml of water the coffee machine has: 500

Write how many ml of milk the coffee machine has: 250

Write how many grams of coffee beans the coffee machine has: 200

Write how many cups of coffee you will need: 10

No, I can make only 2 cup(s) of coffee

OR;

Write how many ml of water the coffee machine has: 1550

Write how many ml of milk the coffee machine has: 299

Write how many grams of coffee beans the coffee machine has: 300

Write how many cups of coffee you will need: 3

Yes, I can make that amount of coffee (and even 2 more than that)

OR;

Write how many ml of water the coffee machine has: 0

Write how many ml of milk the coffee machine has: 0

Write how many grams of coffee beans the coffee machine has: 0

Write how many cups of coffee you will need: 1

No, I can make only 0 cup(s) of coffee

OR;

Write how many ml of water the coffee machine has: 0

Write how many ml of milk the coffee machine has: 0

Write how many grams of coffee beans the coffee machine has: 0

Write how many cups of coffee you will need: 0

Yes, I can make that amount of coffee

OR;

Write how many ml of water the coffee machine has: 200

Write how many ml of milk the coffee machine has: 50

Write how many grams of coffee beans the coffee machine has: 15

Write how many cups of coffee you will need: 0

Yes, I can make that amount of coffee (and even 1 more than that)

---
## Stage #4: Action!
Upgrade your knowledge of methods - set the machine to perform three basic actions: collect the money, renew the supplies, and serve the coffee.

### Description:

Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee. The coffee machine has several options: first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of supplies, except that all of them requires only one disposable cup. Second, the coffee machine should be able to get replenished by a special worker. Third, another special worker should be able to take money from the coffee machine.

Write the program that can do one of these actions at a time. It reads one line from standard input, which can be "buy", "fill", "take". If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill out all the supplies for the coffee machine, input "fill". If you are another special worker and it is time to take the money from the coffee machine, input "take".

If the user writes "buy" then he must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4. For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7. And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6. If the user writes "fill", the program should ask him how much water, milk, coffee beans and how many disposable cups he wants to add into the coffee machine.

If the user writes "take" the program should give him all the money that it earned from selling coffee.

At the moment, the coffee machine has $550, 1200 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

Write the program that prints the coffee machine’s state, processes one query from the user, and also prints the coffee machine’s state after that. Try to use methods to implement every action that the coffee machine can do.

### Output example
An espresso should be as number 1 in the list, a latte as number 2 and a cappuccino as number 3. Options also should be named as "buy", "fill", "take".

The coffee machine has:

1200 of water

540 of milk

120 of coffee beans

9 of disposable cups

550 of money

Write action (buy, fill, take): buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: 3

The coffee machine has:

1000 of water

440 of milk

108 of coffee beans

8 of disposable cups

556 of money

or,

The coffee machine has:

1200 of water

540 of milk

120 of coffee beans

9 of disposable cups

550 of money

Write action (buy, fill, take): fill

Write how many ml of water do you want to add: 2000

Write how many ml of milk do you want to add: 500

Write how many grams of coffee beans do you want to add: 100

Write how many disposable cups of coffee do you want to add: 10

The coffee machine has:

3200 of water

1040 of milk

220 of coffee beans

19 of disposable cups

550 of money

OR;

The coffee machine has:

1200 of water

540 of milk

120 of coffee beans

9 of disposable cups

550 of money

Write action (buy, fill, take): take

I gave you $550

The coffee machine has:

1200 of water

540 of milk

120 of coffee beans

9 of disposable cups

0 of money