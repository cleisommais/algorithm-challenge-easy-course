package com.algorithms.array_and_strings;

import java.util.HashMap;
import java.util.Map;

public class SumTwoItems {
    public int[] twoIceCreamsByMoney(int[] flavorsValue, int money) {

        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < flavorsValue.length; i++) {
            int difference = money - flavorsValue[i];
            if (temp.containsKey(difference)) {
                return new int[]{temp.get(difference), i};
            }
            temp.put(flavorsValue[i], i);
        }

        return new int[0];
    }
}
