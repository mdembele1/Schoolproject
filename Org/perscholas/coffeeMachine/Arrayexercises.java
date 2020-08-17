package Org.perscholas.coffeeMachine;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayexercises {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] grades= new int[10];
		//System.out.println(Arrays.toString(grades));
		
		for(int i=0;i<10; i++) {
		int x=in.nextInt();
		grades[i]=x;
		
	}
		
		System.out.println(Arrays.toString(grades));

	}

}
