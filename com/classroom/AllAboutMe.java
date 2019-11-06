package com.classroom;

public class AllAboutMe {

	public static void main(String[] args) {
//		All about me
//
//		Create Strings named [myName], [myEyes], [myTeeth], and [myHair].
//		Create integers named [myAge] and [myHeight].

		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight;
		
				
//		Use the following values for your variables
//		[myName] = "Shahparan"
//		[myAge] = 31
//		[myHeight] = 175
//		[myEyes] = "Black"
//		[myTeeth] = "White"
//		[myHair] = "Black"

						myName = "Shahparan";
						myAge = 31;
						myHeight = 175;
						myEyes = "Black";
						myTeeth = "White";
						myHair = "Black";
				
						String name= myName;
						int age= myAge;
						int height= myHeight;
						String eyes= myEyes;
						String teeth= myTeeth;
						String hair= myHair;
						
						
//		Print out the following lines:
//
//		//Output
//		Let's talk about [myName].
//		They're [myHeight] inches tall.
//		They're [myAge] years old.
//		Huh, that's older than I expected...
//		They have [myEyes] eyes and [myHair] hair.
//		Their teeth are usually [myTeeth], but it depends on the coffee.
//		Alright, this is pretty boring. Let's stop talking about [myName].

			System.out.printf("Let's talk about, %s \n", name);	
			System.out.println("They're " + height + " inches tall");
			System.out.println("They're " + age+ " years old");
			System.out.println("Huh, that's older than I expected...");
			System.out.println("They have " + eyes+ " eyes and" +  myHair+ " hair");
			System.out.println("Their teeth are usually " + teeth + " , but it depends on the coffee.");
			System.out.println("Alright, this is pretty boring. Let's stop talking about " + name + " .");
		
			
						
						
//		WHAT YOU NEED TO DO
//		1. Take the "my" out of the variable names! For instance, [myName] becomes [name].
//		2. Remember to change those varible names EVERYWHERE. If the code doesn't work, make sure the variable names match up.
//		3. Change the values to match your info. Your name might not be "Shahparan", so change it!
//		4. Create a new variable that converts your height to centimeters. Make your program to the math!

		
	}

}