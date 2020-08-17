package com.week2;

import java.util.Scanner;

public class Test {

	

		static int waterE = 250;static int milkE = 0;static int beansE = 16;static int costE = 4;
		static int waterL = 350;static int milkL = 75;static int beansL = 20;static int costL = 7;
		static int waterC = 200;static int milkC = 100;static int beansC = 12;static int costC = 6;
		static int rWater = 10000;static int rMilk = 10000;static int rBeans = 10000;static int cash = 0;
		static int userCoffee =0;

		// Function to check String for only Alphabets
		public static boolean IsStr(String str) {
			return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
		}
//		public static boolean IsInt(int num) {
//			
//			return num.matches([1-3]{1}[^a-zA-Z]*$);
//		}
		static Scanner input = new Scanner(System.in);

		public static void main(String[] args) {

			
			System.out.println("Please make a selection:");
			while (true) {
				System.out.printf("\nMain Menu:\n -Buy\n -Fill\n -Take\n -Remaining\n -Exit\n");
				String userMenu = input.next();
				if (IsStr(userMenu)) {

					switch (userMenu.toLowerCase()) {
					case "buy":
						System.out.printf("  1.Espresso-$4\n  2.Latte-$7\n  3.Cappucino-$6\n");
						userCoffee = input.nextInt();
//////
						
						Mbuy();
						break;

					case "fill":
						refill();
						break;

					case "take":
						
						Totalcost();
						
						break;

					case "remaining":
						bilan();
						break;

					case "exit":
						mexit();
						
						break;
					default:
						System.out.println("Incorrect input, try again!");
					}

				} else {
					System.out.println("input accepts strings only, try again!");
				}
	}
		}


	private static void Mbuy() {
		
		while (userCoffee < 1 || userCoffee > 3) {
			System.out.println("Use # 1-3,try again!");
			userCoffee = input.nextInt();
		}
		if (userCoffee == 1) {
			System.out.println("How many cups?");
			int userCup = input.nextInt();

			if (userCup * waterE > rWater || userCup * milkE > rMilk || userCup * beansE > rBeans) {
				System.out.print("Not Enough resources ");

				if (userCup * waterE > rWater) {
					System.out.print("water");
				}
				if (userCup * milkE > rMilk) {
					System.out.print(" milk ");
				}
				if (userCup * beansE > rBeans) {
					System.out.print(" coffee beans");
				}
			} else {
				System.out.printf("I have enough resources, making you %d cup(s) espresso\nOrder cost: $%d",
						userCup, (userCup * costE));

				rWater -= userCup * waterE;
				rMilk -= userCup * milkE;
				rBeans -= userCup * beansE;
				cash += (userCup * costE);

				userCup = 0;
				userCoffee = 0;

			}

		} else if (userCoffee == 2) {
			System.out.println("How many cups?");
			int userCup = input.nextInt();

			if (userCup * waterL > rWater || userCup * milkL > rMilk || userCup * beansL > rBeans) {
				System.out.print("Not Enough resources ");

				if (userCup * waterL > rWater) {
					System.out.print("water");
				}
				if (userCup * milkL > rMilk) {
					System.out.print(" milk ");
				}
				if (userCup * beansL > rBeans) {
					System.out.print(" coffee beans");
				}
			} else {
				System.out.printf("I have enough resources, making you %d cup(s) latte\nOrder cost: $%d",
						userCup, (userCup * costL));

				rWater -= userCup * waterL;
				rMilk -= userCup * milkL;
				rBeans -= userCup * beansL;
				cash += (userCup * costL);

				userCup = 0;
				userCoffee = 0;
			}
		} else if (userCoffee == 3) {
			System.out.println("How many cups?");
			int userCup = input.nextInt();

			if (userCup * waterC > rWater || userCup * milkC > rMilk || userCup * beansC > rBeans) {
				System.out.print("Not Enough resources ");

				if (userCup * waterC > rWater) {
					System.out.print("water");
				}
				if (userCup * milkC > rMilk) {
					System.out.print(" milk ");
				}
				if (userCup * beansC > rBeans) {
					System.out.print(" coffee beans");
				}
			} else {
				System.out.printf(
						"I have enough resources, making you %d cup(s) cappucino\nOrder cost: $%d", userCup,
						(userCup * costC));

				rWater -= userCup * waterC;
				rMilk -= userCup * milkC;
				rBeans -= userCup * beansC;
				cash += (userCup * costC);

				userCup = 0;
				userCoffee = 0;
			}
		}
			
		}


	private static void mexit() {
		System.out.println("You have exited the coffee machine, have a great day!");
		
		
		System.exit(1);
			
		}


	private static void bilan() {
		System.out.printf("We have %d water, %d milk, %d coffee beans\nTotal cash is $%d", rWater, rMilk,
				rBeans, cash);
			
		}


	private static void Totalcost() {
		System.out.printf("I'll give you a total of $%d", cash);
		cash = 0;
			
		}


	private static void refill() {
			System.out.printf("How much water would you like to add?");
			rWater += input.nextInt();
			System.out.printf("How much milk would you like to add?");
			rMilk += input.nextInt();
			System.out.printf("How much coffee bean would you like to add?");
			rBeans += input.nextInt();
			System.out.printf("You now have %d ml water, %d ml milk and %d grams coffee beans", rWater, rMilk,
					rBeans);

			
		}
}
