package com.algorithms.array_and_strings;

public class NewYearChaos {

    public void minimumBribes(int[] q) {
        int size = q.length;
        int bribe = 0;
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (q[count] - (count + 1) > 2) {
                System.out.println("Too chaotic");
                break;
            }
            count++;
            int j = 0;
            while (j <= i) {
                if (q[j] > q[i]) {
                    bribe++;
                }
                j++;
            }
        }
        System.out.println(bribe);
    }
}
