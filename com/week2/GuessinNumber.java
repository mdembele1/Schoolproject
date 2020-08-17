package com.week2;

import java.util.Scanner;

/**
 * @author mamadou
 *
 */
public class GuessinNumber {

	public static void main(String[] args) {

		int rand= (int)((Math.random()*100));
		System.out.printf("The random number is: %d \n", rand );
		
		Scanner input=new Scanner(System.in);
		System.out.println("What's the random number?: ");
		int number=input.nextInt();
		
	while (number!=rand) {
		
		if (number<rand)
			System.out.println("The number is too low");

		
		else
			System.out.println("The number is too high");
			System.out.println("Try again:");
			number=input.nextInt();
			//count++;
			
	} 
	
	
	
		System.out.println("Congratulation!!!!");
		
		
	
			
	}
}

