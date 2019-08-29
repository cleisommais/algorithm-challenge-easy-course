package com.algorithms.array_and_strings;

public class StringRotation {
    public boolean isRotation(String stringA, String stringB) {
        int length = stringA.length();
        if (length == stringB.length() && length > 0)
            return isSubstring(stringA + stringA, stringB);
        return false;
    }

    private boolean isSubstring(String stringA, String stringB) {
        return true;
    }
}
