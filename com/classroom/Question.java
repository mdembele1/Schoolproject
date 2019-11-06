package com.classroom;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
//		1. Asking Questions
//
//		Create a String named [name]
//		Create an integer named [age]
//		Create a double named [wage]
//
//		Your code should ask the following question
//		Hello. What's your name?
//
//		Set [name] to the user's input
//
//		Your code should ask the following question
//		Hi [name]! How old are you?
//
//		Set [age] to the user's input
//
//		Your code should ask the following question
//		So you're [age], eh? That's not old at all!
//		How much do you make, [name]?
//
//		Set [wage] to the user's input
//
//		Finally, output this line
//		[wage]! That's really good for your [age]!
		
		String name;
		int age;
		double wage;
		
		System.out.println("Hello. What's your name?");
		
		Scanner input= new Scanner(System.in);
		name= input.next();
		
		System.out.println("Hi " + name+ "! How old are you?");
		
		age=input.nextInt();
		
		System.out.println("So you're " +  age  + " , eh? That's not old at all!\r\n" + 
				"	How much do you make, " + name + " ?");
		
		wage=  input.nextDouble();
		
		System.out.println(wage +  " ! That's really good for your " + age + "!");
		
		

	}

}
