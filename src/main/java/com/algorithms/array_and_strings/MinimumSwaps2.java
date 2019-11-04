package com.algorithms.array_and_strings;

import java.util.HashMap;
import java.util.Map;

public class MinimumSwaps2 {
    // Complete the minimumSwaps function below.
    public int minimumSwaps(int[] arr) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            integerIntegerMap.put(arr[i], i);
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) != arr[i]) {
                int index = integerIntegerMap.get(i + 1);
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                integerIntegerMap.put(i + 1, i);
                integerIntegerMap.put(arr[index], index);
                count++;
            }
        }
        return count;
    }
}