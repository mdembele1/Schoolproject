package com.week2;

import java.util.Scanner;

public class ReusgCodein {

	public static String getInput(String message) {
		Scanner input=new Scanner(System.in);
		System.out.println(message);
		return input.nextLine();
	}

	public static void main(String [] args) {
		String word1=getInput ("What's your first word?");
		String word2=getInput ("What's your second word?");
		String word3=getInput ("What's your third word?");
		String word4=getInput ("What's your fouth word?");
		String word5=getInput ("What's your fifth word?");
		
		
	}
}
