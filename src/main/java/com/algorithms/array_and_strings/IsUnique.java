package com.algorithms.array_and_strings;

public class IsUnique {

    public boolean isUniqueCharsASCII(String str) {
        //ASCII table has 128 characters
        if (str.length() > 128)
            return false;
        boolean[] charSet = new boolean[128];
        for(int i = 0; i < str.length(); i++){
            if(charSet[str.charAt(i)])
                return false;
            charSet[str.charAt(i)] = true;
        }
        return true;
    }

    public boolean isUniqueCharsUNICODE(String str) {
        //UNICODE table has 137.000 characters
        if (str.length() > 137000)
            return false;
        boolean[] charSet = new boolean[137000];
        for(int i = 0; i < str.length(); i++){
            if(charSet[str.charAt(i)])
                return false;
            charSet[str.charAt(i)] = true;
        }
        return true;
    }
}
