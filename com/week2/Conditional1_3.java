package com.week2;
import java.util.Scanner;

public class Conditional1_3 {

	public static void main(String[] args) {
		/**
		 * Car and Buses
		 * 
		 * 
		 */
		
//
//3. Cars or Buses
//
//Create three integers named [people], [cars], and [buses].
//
//
//4. Specific legal problems
//
//Make a program which displays a different message depending on the age given. 
//
//Here are the possible responses:
//age is less than 16, say "You can't drive."
//age is less than 18, say "You can't vote."
//age is less than 25, say "You can't rent a car."
//age is 25 or over, say "You can do anything that's legal."
//
//NOTE: Unlike the original legal problems, this program must ONLY display exactly ONE message based on age.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number of people: ");
		int people= input.nextInt();
		
		System.out.println("Enter the number of cars: ");
		int cars=input.nextInt();
		
		System.out.println("Enter the number of buses: ");
		int buses=input.nextInt();
		
		input.close();
		
		
		
		
		
		
		
		
		
	}

}
