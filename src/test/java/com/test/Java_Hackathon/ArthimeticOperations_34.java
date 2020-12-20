package com.test.Java_Hackathon;


//Write a method to implement *, - , / operations. You should use only the + operator
public class ArthimeticOperations_34{ 
	
static int flipSign(int a) 
{ 
	int neg = 0; 

	// If sign is + ve turn it -ve 
	// and vice-versa 
	int tmp = a < 0 ? 1 : -1; 
	while (a != 0) 
	{ 
		neg += tmp; 
		a += tmp; 
	} 
	return neg; 
} 

//Check if a and b are of different signs 
static boolean areDifferentSign(int a, int b) 
{ 
	return ((a < 0 && b > 0) || (a > 0 && b < 0)); 
} 

static int sub(int a, int b) 
{ 
	return a + flipSign(b); 
} 

static int mul(int a, int b) 
{ 
	if (a < b) 
		return mul(b, a); 

	int sum = 0; 
	for (int i = Math.abs(b); i > 0; i--) 
		sum += a; 

	if (b < 0) 
		sum = flipSign(sum); 

	return sum; 
} 

static int division(int a, int b) 
{ 
	if (b == 0) 
		throw new ArithmeticException(); 

	int quotient = 0, dividend; 

	int divisor = flipSign(Math.abs(b)); 

	for (dividend = Math.abs(a); dividend >= Math.abs(divisor); 
		dividend += divisor) 
		quotient++; 

	if (areDifferentSign(a, b)) 
		quotient = flipSign(quotient); 
	return quotient; 
} 

public static void main(String[] args) 
{ 
	System.out.println("Subtraction is " + sub(10, 2)); 
	System.out.println("Product is " + mul(9, 6)); 

	try
	{ 
		System.out.println("Division is " + division(8, 2)); 
	} 

	catch (ArithmeticException e) 
	{ 
		System.out.println("Exception :- Divide by 0"); 
	} 
} 
} 


