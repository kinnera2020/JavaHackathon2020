//Q22. WJP to convert int to string 

package com.test.Java_Hackathon;

import java.util.Scanner;

public class Int_string22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		int input = new Scanner(System.in).nextInt();
		
		int remainder = 0;
		StringBuilder str = new StringBuilder("");
		
		do {
		remainder = input%10;
		str.append(remainder);
		input = input/10;
		} while(input>0);
		
		System.out.println("Number String:"+str.reverse());
		
	}

}
