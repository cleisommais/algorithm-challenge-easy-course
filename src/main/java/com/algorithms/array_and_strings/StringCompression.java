package com.algorithms.array_and_strings;

public class StringCompression {
    public String compress(String str) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(count);
                count = 0;
            }
        }
        return stringBuilder.toString();
    }
}
