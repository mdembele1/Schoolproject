package com.week2;

import java.util.Scanner;

public class Conditional2_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Enter a number:" );
		int number=input.nextInt();
		
		if (number>0)
			System.out.printf("%d is a positive number", number);		
		else if(number<0)
			System.out.printf("%d is a negative number", number);
		else
			System.out.printf("%d is called origin", number);
		

	}

}
