package com.algorithms.array_and_strings;

public class ArrayManipulation {
    public long arrayManipulation(int n, long[][] queries) {
        long[] arraySum = new long[n];
        long high = 0, temp = 0;
        for (long i = 0; i < queries.length; i++) {
            long a = queries[(int) i][0];
            long b = queries[(int) i][1];
            long k = queries[(int) i][2];
            if ((a - 1) >= 0)
                arraySum[(int) a - 1] += k;
            if (b < arraySum.length)
                arraySum[(int) b] -= k;
        }
        for (int i = 0; i < arraySum.length; i++) {
            temp += arraySum[i];
            if (high < temp)
                high = temp;
        }
        return high;
    }
}
