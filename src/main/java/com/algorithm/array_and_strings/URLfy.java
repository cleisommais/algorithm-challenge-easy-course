package com.algorithm.array_and_strings;

public class URLfy {
    public String replace(char[] str, int strLength) {
        if (str.length == 0)
            return null;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i <= strLength; i++) {
            if (str[i] == ' ') {
                newStr.append("%20");
            } else {
                newStr.append(str[i]);
            }
        }
        return newStr.toString();
    }

}
