package com.week2;

import java.util.Scanner;

public class Whilesum {

	public static void main(String[] args) {

Scanner input= new Scanner (System.in);

System.out.println("Enter a number: ");

int number=input.nextInt();
int sum=0;

while (number!=0)
{ sum= sum+number;
System.out.println("continue... ! Enter a number: ");
number=input.nextInt();
}

System.out.printf("The total sum is %d ", sum);
	}
	

}
