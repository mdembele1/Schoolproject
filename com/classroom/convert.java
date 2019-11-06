package com.classroom;

import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
//		Write a Java program that reads a number in inches, converts it to meters. 
//		Note: One inch is 0.0254 meter.
//
//		Example:
//		Input a value for inch: 1000
//		Expected Output: 1000.0 inch is 25.4 meters
		
		Scanner input = new Scanner (System.in);
		System.out.println("Input a value for inch:");
		int inches = input.nextInt();
		double OneI=(25.4/inches);		
		
		System.out.println("Expected Output: " + inches + " inch" + " is "+ OneI*inches + " cm");
		
		input.close();
		
		
		
	}

}
