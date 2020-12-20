//Q16. Write a method that will remove given character from the String? *

package com.test.Java_Hackathon;


public class Remove_char16 {

	public static void main(String[] args) {
		
	
	     String str = "December";
		      System.out.println(removeCharAt(str, 3));
		   }
		   public static String removeCharAt(String s, int pos) {
		      return s.substring(0, pos) + s.substring(pos + 1);
		   }
		

	}


