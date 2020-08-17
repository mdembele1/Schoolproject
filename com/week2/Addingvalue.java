package com.week2;

import java.util.Scanner;

public class Addingvalue {

	public static void main(String[] args) {
//		5. Adding values
//
//		Create a loop that will ask the user for numbers. Add up all integers they give you.
//		Stop when the user inputs a 0 and display the final total.
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number= input.nextInt();
		int sum=0;
		
		while (number !=0)
		{
			System.out.println("Continue Add up...");
			sum=sum+number;
		number= input.nextInt();
		
				}
		System.out.println("The final total:  " +sum);
		
		
		
		
		
		
		input.close();
	}

}
