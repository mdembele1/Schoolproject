package Org.perscholas.methodsweek3;

public class TestMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=4,num2=2, num3=3;
		//int sum=num1+num2+num3;
		
		int returnofsum= sum (num1,num2,num3);
		
	//	double avg=returnofsum/3;
		double returnofAvg= avg(returnofsum);
		
		//int mult=num1*num2*num3;
		int returnofMult= Mult (num1, num2, num3);
		
		PrintResults(returnofsum,returnofAvg, returnofMult);
		
		
		//System.out.println(returnofsum + "  " + avg + "  "+ mult);
		
		
	}

	private static void PrintResults(int returnofsum, double returnofAvg, int returnofMult) {
		System.out.println("Sum:"+ returnofsum +"  "+"Average:"+ returnofAvg +"  " + "Multiplication:"+ returnofMult);
		
	}

	private static int Mult(int num1, int num2, int num3) {
		int calc=num1*num2*num3;
	return calc;
	}

	static int sum(int n1, int n2, int n3) {
		int calc=n1+n2+n3;
	return calc;	
	}
	
	
		static double avg(int sum) {
			double calc=(double)(sum/3);
		return calc;
		
		}
		
		
	}

