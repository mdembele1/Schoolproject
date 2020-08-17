package com.SBAw3;

import java.util.Scanner;

public class Mamadou_dembele3sba2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word= scan.nextLine();
		
			
		
		for (int j=0; j<word.length()-1;j++) {
			//System.out.println(word.charAt(j));
			//System.out.println(word.length());
			
			if (word.charAt(j)<= word.charAt(j+1)) {
				System.out.println(word+" is a abecedarian word");
				
				
			}
			else if(word.charAt(j)>=word.charAt(j+1))
				System.out.println(word+" is not a abecedarian word");
			
		}
			
			
			
		
		
				
			

			
				
	}

	
}
