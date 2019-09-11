package com.algorithms.array_and_strings;

public class LeftRotation {
    public int rotLeft(int[] a, int d) {
        int j = d;
        int i = 0;
        int[] temp = new int[a.length];
        for (i = 0; i < (a.length - d); i++) {
            temp[i] = a[j];
            j++;
        }
        j = 0;
        for (i = (a.length - d); i < a.length; i++) {
            temp[i] = a[j];
            j++;
        }
        return temp[a.length - 1];
    }
}
