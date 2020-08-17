package com.week2;

import java.util.Scanner;

public class GuessN {

	public static void main(String[] args) {
//		2. Guess the number
//
//		Create a game that will ask a user to guess a number between 1 and 10 until their guess is correct.
//		The answer should be predefined, for now.
		
		
		Scanner input= new Scanner (System.in);
		int number = (int)( Math.random()*10 +1);
		
		System.out.println(number);
		
		System.out.println("Enter the guess number");
		int guessnumber=input.nextInt();
		
		while ( guessnumber !=number)
		{System.out.println("Wrong number!Try again" );
		guessnumber=input.nextInt();
				}
		System.out.println("Bingo!!!! You get it !!!");
			
input.close();
	}
}