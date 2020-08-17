package Org.perscholas.methodsweek3;

import java.util.Scanner;

public class MenuMamadou {

	public static void main(String[] args) {
	Scanner input= new Scanner (System.in);

	int coffee=0, tea=0, sandwitch=0;
	
			//Printing interface  Menu
	
	System.out.println("-----Menu--------");
	System.out.println("Select One of below Option:");
	System.out.println("-------------------");
	System.out.println("1-Add Coffee");
	System.out.println("2-Add tea");
	System.out.println("3-Add Sandwitch");
	System.out.println("4-Exit");
	System.out.println("-------------------");
	
	
	System.out.println("Make your order:");
	int choice=input.nextInt();
	
	//while (choice<1 || choice>4){
	while (choice!=4){
	if (choice==1) {
		coffee++;
		System.out.println("Coffee added..");
		
	}
	else if(choice==2) {
		tea++;
		System.out.println("Tea added..");
		
			}
	else if(choice==3) {
		sandwitch++;
		System.out.println("Sandwitch added..");
		
	}
		else if (choice==4 || choice<1 || choice>4) {
			System.out.println("Your order is: ");
			System.out.println("--------------------");
			System.out.println(coffee+" "+ " Coffee");
			System.out.println(tea+" "+ " Tea");
			System.out.println(sandwitch+" "+ " sandwitch");
		}
	
	choice=input.nextInt();
	}
	
		
	
	}
}
