//Q14. Given a string print the reverse of the words string.
//(Input: Java Code Output: Code Java)

package com.test.Java_Hackathon;
import java.util.Scanner;
public class Words_reverse14 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Original string : ");
	 
	        String originalStr = sc.nextLine();
	        sc.close();
	 
	        String words[] = originalStr.split("\\s");
	        String reversedString = "";
	 
	        for (int i = 0; i < words.length; i++) { 
	            if (i == words.length - 1) 
	                reversedString = words[i] + reversedString; 
	            else
	                reversedString = " " + words[i] + reversedString; 
	        } 
	 
	        System.out.print("Reversed string : " + reversedString);
	    }
	}
