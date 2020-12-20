package com.test.Java_Hackathon;

import java.util.Scanner;

public class Factorial_28 {
	public static long factorial(long n) {
	      if (n <= 1)
	         return 1;
	      else
	         return n * factorial(n - 1);
	   }
	
	public static void main(String[] args) {
		System.out.println("Enter the number to find its factorial:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		long factorial = factorial(number);
		
		System.out.println("Factorial = "+ factorial);
	}
}
