package com.algorithms.array_and_strings;

public class CheckPermutation {

    private static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z)
            return val - a;
        return -1;
    }

    public static boolean isPermutation(String phrase) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') - 1];
        for (char c : phrase.toCharArray()) {
            int number = getCharNumber(c);
            if (number != -1) {
                table[number]++;
                if (table[number] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }
}
