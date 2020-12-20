//Q17. WJP to find total number of integers, 
//uppercase and lowercase character in the give string


package com.test.Java_Hackathon;
import java.util.Scanner;
public class Int_char17 {

	public static void main(String[] args) {

		String str;
		int upper=0,lower=0,numbers=0;
		 Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter the String : ");
	     str=sc.nextLine();
	     
	     for(int j=0;j<str.length();j++) {
	    	 int asciival = (int)str.charAt(j);
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
		System.out.println("Total no.of integers in a string: "+numbers);
		System.out.println("lowercase letters: "+lower);
		System.out.println("uppercase letters: "+upper);
		}
		

	}


