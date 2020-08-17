package com.week2;

public class NestedLoop {

	public static void main(String[] args) {

		int i;
		int j;
	
		for (i=1; i<12; i++)
		{
			System.out.println();
			System.out.println("Table of " + i);
		
			for (j=1; j<=12; j++)
		{
			
			System.out.println(i+ " x "+ j + " = " + i*j);
			
			}
				
		}
	}
}
