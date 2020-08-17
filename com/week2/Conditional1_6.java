package com.week2;

import java.util.Scanner;

public class Conditional1_6 {

	public static void main(String[] args) {
		
/******
 * Space Weight
 * 
 *******/
		
		
//		6. Space Weight
//
//		Create a program that will ask you for your current weight.
//		The program should then give you a list of planets and numbers that you can use to select them.
//		The program will then ask you for which planet you're selecting.
//		Then, the program will multiply your current weight by the relative gravity of that planet.
//		Finally, the program will output your relative weight on that planet (gravity * weight)
//
//		The relative gravities and numbers of each planet are as follows:
//		1 (Venus) -> 0.78
//		2 (Mars) -> 0.39
//		3 (Jupiter) -> 2.65
//		4 (Saturn) -> 1.17
//		5 (Uranus) -> 1.05
//		6 (Neptune) -> 1.23
//
//		Your output could be the following:
//		Please enter your current earth weight: 
//		>128
//
//		I have information for the following planets:
//		1. Venus
//		2. Mars
//		3. Jupiter
//		4. Saturn
//		5. Uranus
//		6. Neptune
//		Which planet are you visiting? 
//		>2
//
//		Your weight would be 49.92 pounds on that planet.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your current earth weight: ");
		int weight= input.nextInt();
		
		double Venu= (weight*0.78);
		double Mar= weight*0.39;
		double Jup=weight* 2.65;
		double Sat=weight* 1.17;
		double Ur=weight* 1.05;
		double Nept=weight* 1.23;
				
	System.out.println("I have information for the following planets:  ");
	System.out.println(" 1. Venus\n 2. Mars\n 3. Jupiter\n 4. Saturn\n 5. Uranus\n 6. Neptune\n");

	System.out.println("Which planet are you visiting?");
	int planete= input.nextInt();
	
	input.close();
	

	
	switch (planete)
	{
		case 1:
			System.out.println("Your weight would be "+ Venu +" pounds on that planet");
			break;
		case 2:
			System.out.println("Your weight would be "+ Mar +" pounds on that planet");
			break;
		case 3:
			System.out.println("Your weight would be "+ Jup +" pounds on that planet");
			break;
		case 4:
			System.out.println("Your weight would be "+ Sat +" pounds on that planet");
			break;
		case 5:
			System.out.println("Your weight would be "+ Ur +" pounds on that planet");
			break;
		case 6:
			System.out.println("Your weight would be "+ Nept +" pounds on that planet");
			break;
	}
	
		
	
	}

}
