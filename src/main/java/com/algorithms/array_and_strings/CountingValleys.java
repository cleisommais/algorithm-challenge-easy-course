package com.algorithms.array_and_strings;

public class CountingValleys {
    public int numberOfValleys(int n, String s) {
        int count = 0;
        int countValleys = 0;
        boolean isDown = false;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {

            if (c[i] == 'U') {
                count++;
            }
            if (c[i] == 'D') {
                count--;
            }
            if (count < 0) {
                isDown = true;
            } else if (count > 0) {
                isDown = false;
            }
            if (count == 0 && isDown) {
                countValleys++;
            }
        }
        return countValleys;
    }
}
