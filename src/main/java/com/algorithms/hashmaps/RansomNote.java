package com.algorithms.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> map = new HashMap<>();
        if (note.length > magazine.length) {
            System.out.println("No");
            return;
        }
        for (String s : magazine) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        for (String s : note) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) - 1);
                if ((map.get(s)) < 0) {
                    System.out.println("No");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
