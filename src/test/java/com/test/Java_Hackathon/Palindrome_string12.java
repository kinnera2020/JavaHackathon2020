//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?

package com.test.Java_Hackathon;
import java.util.Scanner;
public class Palindrome_string12 {

	public static void main(String[] args) {
		  
		  
		      String value, rev = ""; 
		      Scanner sc = new Scanner(System.in);   
		      System.out.println("Enter a string ");  
		      value = sc.nextLine();   
		      int length = value.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         rev = rev + value.charAt(i);  
		      if (value.equals(rev))  {
		      
		         System.out.println("It is a palindrome."); 
		      }
		      else 
		      
		         System.out.println("It is not a palindrome.");   
		   }  
	}
		 







