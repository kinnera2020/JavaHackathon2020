//Q13. Given a string print the reverse of the string.
//(Input: Java Code Output: edoC avaJ)

package com.test.Java_Hackathon;
import java.util.Scanner;
public class Reverse_string13 {

	public static void main(String[] args) {
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	str=sc.nextLine();	
	char[] ch=str.toCharArray(); 
	System.out.println("Reverse of a String is :"); 
	sc.close();
	int j=ch.length;
	for(int i=j;i>0;i--)
	{
	System.out.print(ch[i-1]); 
	}
	}
}

	


