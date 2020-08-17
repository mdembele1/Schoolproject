package Org.perscholas.methodsweek3;

import java.util.Scanner;

public class ArraysMinMax {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
		
		System.out.println("What is the student name:");
		String name=input.next();
				
		System.out.println("what is the score of  " +name);
		System.out.println("");
		
		
		System.out.println("Enter the number of exams? ");
			 int number = input.nextInt();
			 
			 int[] arr = new int[number];
			 
				int Totalscore=0;

				for(int i=0;i<arr.length;i++){
					System.out.println("Enter the score: " +(i+1));
					arr[i]=input.nextInt();
				}
				
				//initialization ( initialize the container of index 0 as min and max
				int min= arr[0];
				int max =arr[0];
				
				double avg;
				
				// The minimum and maximum
				for(int i=0;i<arr.length;i++){		
		
					if (arr[i]<min)
						min=arr[i];
				else if (arr[i]>max)
						max=arr[i];
					Totalscore=Totalscore+ arr[i];
					avg= Totalscore/arr.length;
				}
				
				//Average of score
				 avg= Totalscore/arr.length;
				
				//Printing
				System.out.println("----------------------");									
				System.out.println("Total: " + Totalscore);
				System.out.println("--------------");
				System.out.println("List of scores");
				for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);	
				System.out.println("-------");}
				System.out.println("Maximun: " +max );
				System.out.println("Minimum: " +min);
				System.out.println("Average: " + avg);
				

				}
	
}
