package com.algorithms.array_and_strings;

public class JumpingOnTheClouds {
    public int jumpingOnClouds(int[] c) {
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                count++;
                i++;
            } else {
                count++;
            }
        }
        return count;
    }
}
