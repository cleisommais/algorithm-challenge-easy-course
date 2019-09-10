package com.algorithms.array_and_strings;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public int numberOfPairs(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                int count = map.get(ar[i]);
                map.put(ar[i], ++count);
            } else {
                map.put(ar[i], 1);
            }
        }
        int count = 0;
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                count = count + (map.get(i) / 2);
            }
        }
        return count;
    }
}
