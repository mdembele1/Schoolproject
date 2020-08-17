package Org.perscholas.methodsweek3;

import java.util.Scanner;

public class OneDimensionArray {
 
	public static void main(String[] args) {
		
			int studNo = 0;
	        int examNo = 0;
	        String[] studNames;
	        double[][] examScores2D;
	        double[] examScores1D;
	        double[] studAvg;
	        double total = 0;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the number of students: ");
	        studNo = scan.nextInt();
	        studNames = new String[studNo];
	        studAvg = new double[studNo];
	        System.out.println("Enter the nubme of exams: ");
	        examNo = scan.nextInt();
	        
	        examScores2D = new double[studNo][examNo];
	        
//	      if(examNo ==1)
//	          //what so ever
//	          System.out.println("Test");
//	      else if (examNo > 1){
	            for (int i = 0; i < studNo; i++) {
	            System.out.println(i+1 + "- Enter sudent name: ");
	            studNames[i] = scan.next();
	            for (int j = 0; j < examNo; j++) {
	                System.out.println("Enter score: ");
	                examScores2D[i][j] = scan.nextDouble();
	                total += examScores2D[i][j]; 
	            }
	            studAvg[i] = total/examNo; 
	            total=0.0;
	        }
	        
	        for(int i=0; i<studNo; i++) {
	            System.out.print(studNames[i] + " ");
	            for(int j=0; j< examNo; j++) {
	                System.out.print(examScores2D[i][j] + " ");
	            }
	            System.out.println(studAvg[i]);
	        		}
	        	}
}
