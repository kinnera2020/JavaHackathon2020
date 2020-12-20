//Q20. WJP to find total number of repeated integers, 
//uppercase and lowercase character in the give string 

package com.test.Java_Hackathon;

import java.util.Scanner;

public class Repeated_Int20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int upper=0,lower=0,numbers=0;
		 Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter the String : ");
	     input=sc.nextLine();
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
				 int asciival = (int)current;
				
				
				if(count>0 && current!='$') {
					if(asciival>47 && asciival <58) {
			    		numbers = numbers+1;
			    	}
			    	else if(asciival>64 && asciival <91) {
			    		upper = upper+1;
			    	}
			    	else if(asciival>96 && asciival <123) {
			    		lower = lower+1;
			    	}	
				}
				
		}
	     
	     
	     
		System.out.println("Total no.of integers in a string: "+numbers);
		System.out.println("lowercase letters: "+lower);
		System.out.println("uppercase letters: "+upper);
		}

}
