package com.test.Java_Hackathon;

import java.util.Scanner;

public class BinarySearch_25 {
	public static void main(String[] args) {
		int numbers[] = {1, 5, 9, 10, 25};
		System.out.println("Numbers -> 1, 5, 9, 10, 25 for binary search");
		System.out.println("Enter the number for search");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int lenght = numbers.length;
		int res = binarySearch(numbers, 0, lenght - 1, x);
		if (res == -1)
		System.out.println("Element not present in the input");
		else
		System.out.println("Element present at index " + res);
		}

		private static int binarySearch(int numbers[], int low, int high, int x) {
			if (high >= low) {
				int mid = low + (high - low) / 2;
				if (numbers[mid] == x)
					return mid;
				if (numbers[mid] > x)
					return binarySearch(numbers, low, mid - 1, x);
				return binarySearch(numbers, mid + 1, high, x);
			}
			return -1;
		}
		
	
}
