package com.classroom;

import java.util.Scanner;

public class DataMining {

	public static void main(String[] args) {
//		Data Mining
//
//		First, print the following line:
//		Please enter the following information so I can sell it for a profit!
//
//		Then, prompt the user for the following pieces of information:
//		First Name as a String named [fname]
//		Last Name as a String named [lname]
//		Grade (9-12) as an int named [grade]
//		Student ID as an int named [id]
//		Login as a String named [login]
//		GPA (0.0-4.0) as a double named [gpa]
//
//		Finally, print the following lines:
//		Your Information:
//		Login: [login]
//		ID: [id]
//		Name: [lname], [fname]
//		GPA: [gpa]
//		Grade: [grade]
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		Scanner input = new Scanner (System.in);
		
		System.out.println("First Name: ");
		String fname = input.next();
		
		System.out.println("Last Name: ");
		String lname = input.next();
		
		System.out.println("Grade (9-12): ");
		int grade= input.nextInt();
		
		System.out.println("Student ID: ");
		int id= input.nextInt();
		
		System.out.println("Login: ");
		String login= input.next();
		
		System.out.println("GPA (0.0-4.0): ");
		double gpa= input.nextDouble();
		
		System.out.println("Your Information:");
		
		System.out.println(" Login: "  + login);
		System.out.println(" ID: " + id);
		System.out.println(" Name:" + lname +" ," + fname);
		System.out.println(" GPA: " +gpa);
		System.out.println(" Grade: " + grade);
		 
 
	}

}
