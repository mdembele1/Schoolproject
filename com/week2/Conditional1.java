package com.week2;

import java.util.Scanner;

public class Conditional1 {

	public static void main(String[] args) {
		// Create three integers and assign

		Scanner input = new Scanner(System.in);
		// int people, cats, dogs;

		System.out.println("Enter number of people: ");
		int people = input.nextInt();

		System.out.println("number of cats: ");
		int cats = input.nextInt();

		System.out.println("Enter number of dogs: ");
		int dogs = input.nextInt();

		input.close();

		if (people < cats)
		{
		System.out.println("**1** Too many cats!The world is domed!");
		} 
		else 
		{
			System.out.println("**2** Too few cats! The wolrd is saved for another day!");
		}
		
		if (people < dogs) 
		{
			System.out.println("**3** The world is drooled on!");
		} 
		else 
		{
			System.out.println("**4** The world is dry");
		}

	}

}
