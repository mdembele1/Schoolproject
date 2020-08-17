package com.week2;
import java.util.Scanner;

public class Conditional2_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
System.out.println("Input the 1st number: ");
double a=input.nextDouble();

System.out.println("Input the 2nd number: ");
double b=input.nextDouble();

System.out.println("Input the 3rd number: ");
double c=input.nextDouble();


if (a>=b && a>=c) 
	System.out.println("The greatest: " + a);

else if (a<=b && b>=c) 
	System.out.println("The greatest: " + b);

else if (c>=a &&c>=b)
	System.out.println("The greatest: " + c);
	


	}

}
