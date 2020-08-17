package com.week2;

import java.util.Scanner;

public class Conditional1_2 {

	public static void main(String[] args) {

/**********
 * 
 * 5. Create a method that accepts an integer and returns a string with the corresponding day of the week.
 *  * 
 *********/

//1 -> Monday
//2 -> Tuesday
//3 -> Wednesday
//4 -> Thursday
//5 -> Friday
//6 -> Saturday
//7 -> Sunday
//Anything Else -> Error
//
//Create a main that prompts the user to enter a number between 1-7, passes that number to
//your method in order to get the weekday, and then outputs that weekday.
//
//Your output could be the following:
//Please enter an integer (1-7):
//>2
//
//Weekday 2 is Tuesday!

		Scanner input=new Scanner (System.in);
		

		//User input a number
		System.out.println("Please enter an integer (1-7):");
		int day=input.nextInt();
				
		input.close();
		
		switch (day) 
		{
		case 1:
			System.out.println("Monday");
				break;
		
		case 2:
			System.out.println("Tuesday");
				break;
				
		case 3:
			System.out.println("Wednesday");
				break;
				
		case 4:
			System.out.println("Thursday");
				break;
				
		case 5:
			System.out.println("Friday");
				break;
		
		case 6:
			System.out.println("Saturday");
				break;
				
		case 7:
			System.out.println("Sunday");
				break;
				
		default: 
			System.out.println("Error------------------->>>>>>>>> ");
			
		}
		
		
	}

}
