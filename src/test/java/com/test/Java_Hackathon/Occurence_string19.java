//Q19. WJP to display number of occurrence of all character


package com.test.Java_Hackathon;
import java.util.Scanner;
public class Occurence_string19 {

	public static void main(String[] args) {
		        String str;
		        int i, length, counter[] = new int[256];
		 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a String");
		        str = sc.nextLine();
		 
		        length = str.length();
		 
		        sc.close();
		        for (i = 0; i < length; i++) {
		            counter[(int) str.charAt(i)]++;
		        }
		        
		        for (i = 0; i < 256; i++) {
		            if (counter[i] != 0) {
		                System.out.println((char) i + " - " + counter[i]);
		            }
		        }
		    }
		

	}


