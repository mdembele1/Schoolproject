package com.week2;

import java.util.Scanner;

public class Hi_lo {

	public static void main(String[] args) {
//		4. Hi-Lo
//
//		Create a game that will ask a user to guess a number between 1 and 100 until their guess is correct.
//		When the user guesses incorrectly, tell them whether their guess was too high or too low.
//		When they guess the correct answer, tell them how many tries it took for them to answer correctly.

	Scanner input =new Scanner(System.in);
	int number =  (int)((Math.random()*100));
	
	System.out.println("Enter a number between 1-100: ");
	
	int guessnumber=input.nextInt();
	int count=0;
	
	while (guessnumber !=number)
	{
	if (guessnumber<number)
		System.out.println("Number too low!!!");
	else
			System.out.println("Number too high!!!");
		 count= count+1;
		 guessnumber=input.nextInt();
		}
	//count=count+1;
	
	System.out.println();
	System.out.println("Congralution !! ");
	System.out.println("Number of tries:" + count);
	
	
	}

}
