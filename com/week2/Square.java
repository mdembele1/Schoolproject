package com.week2;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
//		7. Squares
//
//		Write a program in Java to display the square of the number upto given an integer
		
		Scanner input =new Scanner (System.in);
		
		System.out.println("Enter a number:");
		int number=input.nextInt();
		
		for (int i=0;  i<=number; i++)
			System.out.println(i*i);

		
		input.close();
	}

}
