package com.algorithms.array_and_strings;

public class RepeatedString {
    public long repeatedString(String s, long n) {
        long count = 0;
        long totalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
        long divisor = n / s.length();
        totalCount += (n / s.length() * count);
        for (int i = 0; i < (n % s.length()); i++) {
            if (s.charAt(i) == 'a')
                totalCount++;
        }
        return totalCount;
    }
}
