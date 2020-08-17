package com.week2;

import java.util.Scanner;

public class PinNumber {

	public static void main(String[] args) {
//		 PIN Number
//
//		 Create an integer named [pin] and set it to a 4-digit number.
//		 Welcome the user to your application and ask them to enter their pin.
//		 If they get it wrong, print out "INCORRECT PIN. PLEASE TRY AGAIN"
//		 Keep asking them to enter their pin until they get it right.
//		 Finally, print "PIN ACCEPTED. YOU HAVE $0.00 IN YOUR ACCOUNT. GOODBYE."

		Scanner input = new Scanner (System.in);
		System.out.println("Welcome");
		
		int pin=0000;
		System.out.println("Please enter your PIN number: (4 digit)");

		int userpin= input.nextInt();
		while (userpin !=pin) {
			System.out.println("INCORRECT PIN. PLEASE TRY AGAIN....");
		 userpin=input.nextInt();
		}
			 System.out.println("PIN ACCEPTED. YOU HAVE $0.00 IN YOUR ACCOUNT. GOODBYE.");
		
		 
			 
		


	}

}
