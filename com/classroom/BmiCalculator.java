package com.classroom;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
//		 A Simple BMI Calculator
//		 The body mass index (BMI) is commonly used by health and nutrition professionals 
//		 to estimate human body fat in populations.
//
//		 It is computed by taking the individual's weight (mass) in kilograms 
//		 and dividing it by the square of their height in meters.
//
//		 An example of your output could be:
//		 Your height in m: 
//		 >1.75
//
//		 Your weight in kg: 
//		 >73
//
//		 Your BMI is 23.83673

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Your height in m:");
		double height = input.nextDouble();
		
		
		System.out.println("Your weight in kg:");
		double weight= input.nextDouble();
		
		double square= Math.sqrt(height);
		
		
		double bmi= ( weight/square);
		
		System.out.println("Your BMI is " +bmi);
		
		input.close();
		
		
		//bmi=
	}

}
