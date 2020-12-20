//Q21. WJP to convert string to int 

package com.test.Java_Hackathon;

import java.util.Scanner;

public class String_int21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String input = sc.nextLine();
		
		int number =0;
		StringBuilder str = new StringBuilder(input);
		str = str.reverse();
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			int val = Integer.parseInt(String.valueOf(ch));
			
			
			number = number + val * (int)Math.pow(10, i);
			
		}
		
		System.out.println("number in integer format:"+number);

	}

}
