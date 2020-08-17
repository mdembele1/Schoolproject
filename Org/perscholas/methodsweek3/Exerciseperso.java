package Org.perscholas.methodsweek3;

import java.util.Scanner;

public class Exerciseperso {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int studNo=0;
		int examNo=0;
		String[] studName;
		double[][] score;
		double [] avg;
		double total=0;
		
		System.out.println("Enter the number of student: ");
		studNo= input.nextInt();
		System.out.println("Enter the number of exams: ");
		examNo=input.nextInt();
		
		studName=new String[studNo];
		score= new double [studNo][examNo];
		avg= new double [studNo];
		
		for (int i=0; i< studNo; i++){
		System.out.println("Enter the student name");
		studName [i]=input.next();
			for( int j=0; j<examNo; j++) {
				System.out.println("Enter " + studName[i]+" score: ");
				score [i][j]=input.nextDouble();
				total=total+score [i][j];
			}
			avg[i]=total/examNo;
		}

        for(int i=0; i<studNo; i++) {
            System.out.print(studName[i] + " ");
            for(int j=0; j< examNo; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println(avg[i]);
		
					
		        }
		

	}

}
