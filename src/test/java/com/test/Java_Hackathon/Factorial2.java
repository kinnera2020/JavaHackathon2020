//Q2.write a program to find factorial (Non Recursive)


package com.test.Java_Hackathon;
import java.util.Scanner;
public class Factorial2 {

	public static void main(String[] args) {
		
		        int n, fact = 1;
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter any integer:");
		        n = sc.nextInt();
		        for(int i = 1; i <= n; i++)
		        {
		            fact = fact * i;
		        }
		        System.out.println("Factorial of "+n+" :"+fact);
		        sc.close();
		    }
		

	}


