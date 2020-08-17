package com.week2;

import java.util.Scanner;

public class AllEvenNumber {

	public static void main(String[] args) {

//6. All Even Numbers
//
//Create a loop that will print out all even numbers between 1 and a specified integer.

		Scanner input=new Scanner (System.in);
				
		System.out.println("Enter a number: ");
		int number=input.nextInt();
		
				
		
	for (int i=1; i<=number; i++)
	{
			if (i%2==0)
				System.out.println(i);
	}
				
			input.close();
		
	}

}
