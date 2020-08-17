package Org.perscholas.methodsweek3;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("What is the student name:");
		String name=input.next();
				
		System.out.println("what is the score of  " +name);
		System.out.println("");
		
		
		System.out.println("Enter the number of exams? ");
		int number=input.nextInt();
		
					int score=0; 
					int Totalscore=0;
					int min=10000;
					int max=0;
					
				for (int i=1; i<=number; i++) {
					System.out.println("Enter the score: " +i);
					score=input.nextInt();
					
					if (score<min)
						min=score;
					else if (score>max)
						max=score;
					Totalscore=Totalscore+ score;
				}
				
				
			//	int Min= Math.min(score);
				System.out.println("Total: " + Totalscore);
				System.out.println("Maximun: " +max );
				System.out.println("Minimum: " +min);
					
		
		
		
		
	}

}
