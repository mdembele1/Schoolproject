package Org.perscholas.coffeeMachine;

import java.util.Scanner;

public class Stage3 {

	public static void main(String[] args) {
		
				
				Scanner scan=new Scanner(System.in);
				
				int cupcoffeeNo;
				int waterQtity;
				int milkQtity;
				int cofbeansQtity;
				int watermachine;
				int milkmachine;
				int cofbeansmachine;
				int coffeeNomachine;
				
				
				
				
				//Stage #1: Hello, coffee!
				System.out.println("---------------------------");
				System.out.println("Hello, coffee!");
				System.out.println("---------------------------");
				System.out.println("Starting to make a coffee\r\n" + 
						"\r\n" + 
						"Grinding coffee beans\r\n" + 
						"\r\n" + 
						"Boiling water\r\n" + 
						"\r\n" + 
						"Mixing boiled water with crushed coffee beans\r\n" + 
						"\r\n" + 
						"Pouring coffee into the cup\r\n" + 
						"\r\n" + 
						"Pouring some milk into the cup\r\n" + 
						"\r\n" + 
						"Coffee is ready!");
				System.out.println("-----------------------------------------------------------------");
				//Stage #2: Machines have needs
				
//				System.out.println("how many cups of coffee you will need: ");
//				cupcoffeeNo =scan.nextInt();
//				
//				waterQtity= cupcoffeeNo*200;
//				milkQtity=cupcoffeeNo*25;
//				cofbeansQtity=15;
//				
//				System.out.println("For "+cupcoffeeNo+ " cup of coffee you wfill need");
//				System.out.println(waterQtity+ "  ml of water");
//				System.out.println(+milkQtity+ "ml of millk");
//				System.out.println(cofbeansQtity+ " g of coffee beans");
//				
				
				
				System.out.println("How many ml of water the coffee machine has: ");
				watermachine=scan.nextInt();
								
				System.out.println("How many ml of milk the coffee machine has: ");
				milkmachine=scan.nextInt();
				
				System.out.println("How many grams of coffee beans the coffee machine has:");
				cofbeansmachine=scan.nextInt();
				
				System.out.println("How many cups of coffee you will need: ");
				cupcoffeeNo=scan.nextInt();
				
				
				
				cupcoffeeNo=1;
				cofbeansQtity=65;
				watermachine=300;
				milkmachine=65;
				cofbeansmachine=100;
				
				
				int validwatermachine=300*cupcoffeeNo;
				int validmilkmachine=65*cupcoffeeNo;
				int validcofbeansmachine=100*cupcoffeeNo;
				
				
				
				while (cupcoffeeNo>=1 && (cofbeansmachine)>=100 && (milkmachine)>=65 && (watermachine)>300){
					{
						
						validwatermachine=300*cupcoffeeNo;
						validmilkmachine=65*cupcoffeeNo;
						validcofbeansmachine=100*cupcoffeeNo;
						
						if(validwatermachine==300 && validcofbeansmachine==100 && validmilkmachine==65)
							
							System.out.println("Yes, I can make that amount of coffee");
											
						//cupcoffeeNo=scan.nextInt();
							else
								System.out.println("No, I can make only 0 cup(s) of coffee");
					}
						
					
					
				
//					System.out.println("Yes, I can make that amount of coffee (and even 2 more than tha");
//					System.out.println("Yes, I can make that amount of coffee");
				
				
				
				

				
				}
	}
			
	}
