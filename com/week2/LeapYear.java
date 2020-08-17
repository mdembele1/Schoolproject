package com.week2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
/*********
 * 
 * Leap Year
 * 
 *********/
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a Year (YYYY): ");
		int year=input.nextInt();
		
		if ((year%4==0 && year % 100!=0)||(year % 400==0))
		
			System.out.printf("%d, is a Leap Year", year);
		
		else
		{
			System.out.printf("%d, IS NOT a Leap Year", year);
						
		}
		
	}

}
