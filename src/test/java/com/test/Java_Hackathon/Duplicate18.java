//Q18. WJP to display duplicate character in string

package com.test.Java_Hackathon;

import java.util.Scanner;

public class Duplicate18 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String input =sc.nextLine();
	StringBuilder str = new StringBuilder(input);
	
		for(int x=0;x<str.length();x++)
	{       int count =0;
			char current = str.charAt(x);
			for(int y=x+1;y<str.length();y++) {
				if(current == str.charAt(y)) {
					count++;
					str.setCharAt(y, '$');
				}
			}
			
			if(count>0 && current!='$')
				System.out.println(current);
			
	}
	
		       
		

	}

}
