package com.algorithms.array_and_strings;

/*

 */
public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    // Regarding the exact values of "a" and "b", it's a little tricky since "a" and "b" are 1-indexed but our
    // array is 0-indexed. So we want to subtract 1 from both "a" and "b". However, for "b" we re-add 1 because we want
    // to change values from "a" to "b" inclusive as stated in the problem, so we want the end of the interval to be 1
    // to the right of "b" which is why we re-add the 1.
    public long arrayManipulation(int n, int[][] array) {
        /* Find max value */
        int[] arraySum = new int[n];
        int high = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i][0];
            int b = array[i][1];
            int k = array[i][2];
            for (int j = a - 1; j < b; j++) {
                int temp = arraySum[j];
                arraySum[j] = k + temp;
                if (arraySum[j] > high)
                    high = arraySum[j];
            }
        }
        return high;
    }
}
