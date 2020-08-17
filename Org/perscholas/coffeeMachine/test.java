package Org.perscholas.coffeeMachine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class test {

	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		LinkedList <Integer> menu  = new  LinkedList<Integer>();
		int c=0, t=0, s=0, price=0, p=0;
		
		do {
		System.out.println("Plesase select one of the following: ");
		
		System.out.println("1-Coffee: $2.00");
		System.out.println("2-Tea: $1.00");
		System.out.println("3-Sandwich: $5.00");
		System.out.println("4- Exit...");
		
		int userinput=in.nextInt();
		
		switch(userinput) {
		
		case 1:
			menu.add(1);
			System.out.println("Coffee add...");
			
			break;
		case 2:
			menu.add(2);
			System.out.println("Tea add...");
			break;	
		case 3:
			menu.add(3);
			System.out.println("Sandwich add...");
			break;
		default:
			System.out.println("Order Completed!!");
		
		}
		
		while(userinput<4);
		
		  for (int i : menu) {
		 
		
		
	
		}
	}
}
