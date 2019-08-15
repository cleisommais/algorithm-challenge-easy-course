package com.algorithm.array_and_strings;

import java.util.Arrays;

public class CheckPermutation {
    public boolean hasPermutationTwoStrings(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        String str1Ordened = order(str1);
        String str2Ordened = order(str2);
        return str1Ordened.equals(str2Ordened);
    }

    public boolean hasPermutationTwoStringsFaster(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        //ASCII limit
        int[] letters = new int[128];
        //add 1 in the position of array
        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i)]++;
        }
        //subtraction 1 in the position of array
        for (int i = 0; i < str2.length(); i++) {
            letters[str2.charAt(i)]--;
            if (letters[str2.charAt(i)] < 0)
                return false;
        }
        return true;
    }


    private String order(String str) {
        char[] charArrayStr = str.toCharArray();
        Arrays.sort(charArrayStr);
        return new String(charArrayStr);
    }
}
