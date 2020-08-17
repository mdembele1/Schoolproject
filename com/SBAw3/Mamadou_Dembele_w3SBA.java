package com.SBAw3;

public class Mamadou_Dembele_w3SBA {

	public static void main(String[] args) {
		
		int fnumber=0;
		int sednumber=1;
		int sum=0;
		int i;
		int even=0;
		
			
			for(i=1;i<25;++i) {
				sum=fnumber+sednumber;
				fnumber=sednumber;
				sednumber=sum;
				
				//Fibonacci 25  series Number
				System.out.println(i +"# Fibonacci 25 series Number: " +sum);
				
				if( fnumber%2==0) {
					even+=fnumber;

					
				}
					

			}
				
			System.out.println("SUM Fibonacci 25 even series Number: "+ even);
	
	}
}
