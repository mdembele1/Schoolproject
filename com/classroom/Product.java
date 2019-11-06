package com.classroom;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {

//Write a Java program that takes two numbers as input and display the product of two numbers.
//
//Example:
//Input first number: 25
//Input second number: 5
//Expected Output: 25 x 5 = 125
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Input first number: ");
		int FirstNumber = input.nextInt();
		
		System.out.println("Input second number: ");
		int SecondNumber = input.nextInt();
		
		int result=FirstNumber *SecondNumber;
		
		System.out.println("Expected Output: " + FirstNumber+" X " + SecondNumber + " = " + result );
		
		
	}

}
