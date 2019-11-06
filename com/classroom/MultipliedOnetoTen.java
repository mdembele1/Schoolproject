package com.classroom;

import java.util.Scanner;

public class MultipliedOnetoTen {

	public static void main(String[] args) {
//		3. 
//		Write a Java program that takes a number and prints the results of it multiplied from 1 to 10
//
//		Example:
//		Input a number: 8
//		Expected Output:
//		8 x 1 = 8
//		8 x 2 = 16
//		8 x 3 = 24
//		...
//		8 x 10 = 80
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Input a number: ");
		int number = input.nextInt();
		
		int a = number*1;
		int b = number*2;
		int c = number*3;
		int d = number*4;
		int e = number*5;
		int f=  number*6;
		int g = number*7;
		int h = number*8;
		int i = number*9;
		int j = number*10;
		System.out.println(number + " X  1 " +" = " + a);
		System.out.println(number + " X  2 " +" = " + b);
		System.out.println(number + " X  3 " +" = " + c);
		System.out.println(number + " X  4 " +" = " + d);
		System.out.println(number + " X  5 " +" = " + e);
		System.out.println(number + " X  6 " +" = " + f);
		System.out.println(number + " X  7 " +" = " + g);
		System.out.println(number + " X  8 " +" = " + h);
		System.out.println(number + " X  9 " +" = " + i);
		System.out.println(number + " X  10 " +" = " + j);
		
		input.close();
	}

}
