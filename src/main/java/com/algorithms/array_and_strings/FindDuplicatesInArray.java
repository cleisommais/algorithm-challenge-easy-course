package com.algorithms.array_and_strings;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
    public String[] showDuplicatesWithinArray(int[] array) {
        Set<Integer> temp = new HashSet<>();
        StringBuilder duplicates = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (temp.contains(array[i])) {
                duplicates.append(array[i] + ",");
            }
            temp.add(array[i]);
        }
        String[] response = duplicates.toString().split(",");
        return response;
    }
}
