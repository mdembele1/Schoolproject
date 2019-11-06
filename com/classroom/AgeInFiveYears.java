package com.classroom;

import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
//		 Age in Five Years
//
//		 Ask the user for their name. 
//		 Then display their name to prove that you can recall it. 
//		 Ask them for their age. 
//		 Then display what their age would be five years from now. 
//		 Then display what their age would be five years ago.
//
//		 An example of your output could be:
//		 Hi there. What's your name? 
//		 >Shahparan
//
//		 Hi, Shahparan! My name is Java. Nice to meet you.
//		 How old are you? 
//		 >31
//
//		 Did you know that in five years you will be 36 years old?
//		 And five years ago you were 26! Imagine that!// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("Hi there. What's your name?");
		String name=input.next();
		
		System.out.println("Hi, " + name + "! My name is Dembele. Nice to meet you. How old are you?");
		int age=input.nextInt();
		
		System.out.println(" Did you know that in five years you will be " + (age+5) + " years old? And five years ago you were  " + (age-5) +" !Imagine that!");

	input.close();
	}

}
