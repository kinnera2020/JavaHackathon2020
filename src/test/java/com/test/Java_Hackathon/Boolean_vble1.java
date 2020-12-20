//Q1. Consider there is a 3 Boolean variable called a, b, c.
//Check if at least two out of three Booleans are true

package com.test.Java_Hackathon;
import java.util.Scanner;
public class Boolean_vble1 {

	public static void main(String[] args) {
		
		    
		    // create 3 boolean variables
		    boolean a;
		    boolean b;
		    boolean c;
		    boolean result;

		    // get boolean input from the user
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter first boolean value: ");
		    a = input.nextBoolean();

		    System.out.print("Enter second boolean value: ");
		    b = input.nextBoolean();

		    System.out.print("Enter third boolean value: ");
		    c = input.nextBoolean();

		    // check if two are true
		    if(a) {

		      // if first is true
		      // and one of the second and third is true
		      // result will be true
		      result = b || c;
		    }
		    else {

		      // if first is false
		      // both the second and third should be true
		      // so result will be true
		      result = b && c;
		    }

		    if(result) {
		      System.out.println("Two boolean variables are true.");
		    }
		    else {
		      System.out.println("Two boolean variables are not true.");
		    }

		    input.close();
		  }

		


	}


