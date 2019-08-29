package com.algorithms.array_and_strings;

public class OneAway {
    public boolean isOneEdit(String a, String b) {
        if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }
        if (a.length() == b.length())
            return oneEditReplace(a, b);
        else if (a.length() + 1 == b.length())
            return oneEditInsertRemoval(a, b);
        else if (a.length() - 1 == b.length())
            return oneEditInsertRemoval(b, a);
        return false;
    }

    private boolean oneEditReplace(String a, String b) {
        boolean foundDifference = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (foundDifference)
                    return false;
                foundDifference = true;
            }
        }
        return true;
    }

    private boolean oneEditInsertRemoval(String a, String b) {
        int indexA = 0;
        int indexB = 0;
        while (indexB < b.length() && indexA < a.length()) {
            if (a.charAt(indexA) != b.charAt(indexB)) {
                if (indexA != indexB)
                    return false;
                indexB++;
            } else {
                indexA++;
                indexB++;
            }
        }
        return true;
    }
}
