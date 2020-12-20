//WJP to differentiate input as string, int or bool
package com.test.Java_Hackathon;

import java.util.Scanner;

public class FindInputType_23 {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		boolean isInteger;
		
		try {
			Integer.parseInt(str);
			isInteger = true;
			System.out.println("Input is an Integer");
		}catch(Exception e) {
			isInteger = false;
		}
		
		if(!isInteger) {
			if(str.toLowerCase().equals("true") || str.toLowerCase().equals("false")) {
				System.out.println("Input is a Boolean");
			}else {
				System.out.println("Input is a String");
			}
		}
		
		
		
	}
}
