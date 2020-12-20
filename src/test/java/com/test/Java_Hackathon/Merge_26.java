package com.test.Java_Hackathon;

import java.util.Arrays;

class Merge_26
{
    public static void merge(int[] first, int[] second)
    {
        int m = first.length;
        int n = second.length;
 
        for (int i = 0; i < m; i++)
        {
            // compare current element of X[] with first element of Y[]
            if (first[i] > second[0])
            {
                // swap (X[i], Y[0])
                int temp = first[i];
                first[i] = second[0];
                second[0] = temp;
 
                int firstElement = second[0];
 
                // move Y[0] to its correct position to maintain sorted
                // order of Y[]
                int k;
                for (k = 1; k < n && second[k] < firstElement; k++) {
                    second[k - 1] = second[k];
                }
 
                second[k - 1] = firstElement;
            }
        }
    }
 
        public static void main (String[] args)
    {
        int[] firstArray = { 1, 4, 7, 8, 10,0,0,0,0 };
        int[] secondArray = { 2, 3, 5, 9 };
        
        System.out.println("first array: " + Arrays.toString(firstArray));
        System.out.println("second array: " + Arrays.toString(secondArray));
        
        merge(firstArray, secondArray);
        int secondLength = secondArray.length;
        int index = firstArray.length - secondLength;
        for(int val: secondArray) {
        	firstArray[index++] = val;
        }
 
        System.out.println("sorted array: " + Arrays.toString(firstArray));
    }
}




