package Org.perscholas.methodsweek3;

import java.util.Scanner;

public class ArrAssig1 {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);


System.out.println("Enter a number: ");
int inputnum= scan.nextInt();

int [] resulEven;


while(inputnum!=0) {
	if (inputnum%2 !=0) {
		int resultodd= (inputnum+1)/2;
		System.out.println("result odd number: " + resultodd);
		}
	else
	{
		inputnum /= 2;
		
	}
//		else 	
//			for (int i=0; i<resulEven[inputnum];i++)
//					
//				if (i
//		
//			
//			
//					}
//	inputnum= scan.nextInt();
//	
//	;
//	if( inputnum%2==0) {
//		
//	}
//	
//	System.out.println(inputnum +"is a even number");
	
}
	







	}

}
