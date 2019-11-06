package com.week2;

import java.util.Scanner;

public class Conditionnal {
	

	public static void main(String[] args) {
		//Create a scanner object to collect input
				Scanner input= new Scanner(System.in);
				
				//generate a random number between 1 to 10
				int rand = (int) (Math.random()*10) +1;
				
				//generate a random number between 1 to 10
				int rand2 = (int) (Math.random()*10) +1;
				
				System.out.printf("What is %d + %d ? ",rand, rand2);
				
				//Store the user response into a variable
				int response=input.nextInt();
				
				//test the users response to confirm if it is correct
				if (response==rand + rand2)
				{
					System.out.println("You are right!!!");
				}
				else
				{
					System.out.println("Try again;");
					
				}
				
				
				
				
							}

}
