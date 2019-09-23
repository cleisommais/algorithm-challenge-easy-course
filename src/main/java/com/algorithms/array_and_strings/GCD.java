package com.algorithms.array_and_strings;

public class GCD {
    private int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public int generalizedGCD(int num, int[] arr) {
        int result = arr[0];
        for (int i = 1; i < num; i++)
            result = gcd(arr[i], result);
        return result;
    }
}
