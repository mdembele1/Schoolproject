package com.week2;

import java.util.Scanner;

public class RepeatAddition {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		String myString;

		

		int rand=(int)(Math.random()*10);
		int rand2=(int)(Math.random()*10);
		
		int sumrand=rand+rand2;
				
		Scanner input =new Scanner(System.in);
		
		System.out.println(sumrand);
		
		System.out.printf("What's the answer  %d + %d = ?  ", rand,rand2 );
		int number=input.nextInt();

while (number !=sumrand){

	System.out.println("Wrong answer. start again..");

		number=input.nextInt();	
}
	input.close();
	
	
System.out.printf("\u263A \u263A \u263A  %d ------> Great Answer !!!!", number);

	}
	

}