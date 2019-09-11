package com.algorithms.array_and_strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoDArrayDS {
    public int hourglassSum(int[][] arr) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[0].length - 2; j++) {
                int firstLine = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int secondLine = arr[i + 1][j + 1];
                int thirdLine = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                int sum = firstLine + secondLine + thirdLine;
                temp.add(sum);
            }
        }
        Collections.sort(temp);
        return temp.get(temp.size() - 1);
    }
}
