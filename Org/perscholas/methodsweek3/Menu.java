package Org.perscholas.methodsweek3;

import java.util.Scanner;

public class Menu {

		
		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        int input = 0, coffee = 0, tea = 0, sandwitch = 0;
		        double costcoffee = 2.5, costtea = 1.99, costsandwitch = 5.860;
		        
		        while (input != 4) {
		            System.out.println("Select one of below options:");
		            System.out.println("1- Add Coffee");
		            System.out.println("2- Add Tea");
		            System.out.println("3- Add Sandwich");
		            System.out.println("4- Exit");
		            input = scan.nextInt();
		            if (input == 1) {
		                coffee++;
		                
		                System.out.println("One Coffee added!");
		            } else if (input == 2) {
		                tea++;
		               System.out.println("One Tea added!");
		               
		            } else if (input == 3) {
		                sandwitch++;
		                System.out.println("One Sandwitch added!");
		                
		            } else if (input == 4) {
		            //int costcoffee= 
		                System.out.println("You Ordered: ");
		                System.out.println(coffee + " Coffee(s)" +"  "+ "$" + costcoffee);
		                System.out.println(tea + " Tea(s)" +"  "+ "$"+ costtea);
		                System.out.println(sandwitch + " Sandwich(s)" + "  " + "$" + costsandwitch);
		                System.out.println("Thank you!");
		            }
		        }
		    }
		}
		



