package com.algorithms.greedy_algorithms;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceArray {

    // Brute force - time complexity O(N^2)
    public int minimumAbsoluteDifference2(int[] arr) {
        if (arr.length == 1 || arr.length == 0)
            throw new IllegalArgumentException("Array length must be at least two!");
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                int temp = arr[i] - arr[j];
                if (temp >= 0 && temp <= minimum)
                    minimum = temp;
            }
        }
        return minimum;
    }

    //Optimized - time complexity O(N)
    public int minimumAbsoluteDifference(int[] arr) {
        if (arr.length == 1 || arr.length == 0)
            throw new IllegalArgumentException("Array length must be at least two!");
        int minimum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = Math.abs(arr[i] - arr[i + 1]);
            if (temp >= 0 && temp <= minimum)
                minimum = temp;
        }
        return minimum;
    }
}
