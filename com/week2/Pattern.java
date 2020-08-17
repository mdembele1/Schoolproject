package com.week2;

import java.util.Scanner;

public class Pattern {

	
		
//		8. Pattern
//
//		Write a program in Java to display a pattern like this:
 //
//		1
//		22
//		333
//		4444
//
//		Modify the program so that the user can specify what number it should go to.
		
		
		
//		System.out.println("Enter a number:");
//		int number=input.nextInt();

		

		// Function to demonstrate printing pattern 
	    public static void printNums(int n) 
	    { 
	        // initialising starting number 
	        int i, j, num=0; 
	          
	        // outer loop to handle number of rows 
	        // n in this case 
	        for(i=0; i<n; i++) 
	        { 
	  
	            // without re assigning num 
	            // num = 1; 
	             num = num + 1;
	            
	             for(j=0; j<=i; j++) 
	            { 
	                // printing num with a space 
	                System.out.print(num+ " "); 
	                  
	                // incrementing num at each column 
	              //  num = num + 1; 
	            } 
	  
	            // ending line after each row 
	            System.out.println(); 
	        } 
	    } 
	      
	    // Driver Function 
	    public static void main(String args[]) 
	    { 
	        Scanner input=new Scanner (System.in);
	        System.out.println("Enter a number:");
	        int n=input.nextInt();
	    	//int n = 5; 
	        
	        printNums(n); 
	    } 
	} 
