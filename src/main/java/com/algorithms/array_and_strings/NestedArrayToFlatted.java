package com.algorithms.array_and_strings;

import java.util.List;

public class NestedArrayToFlatted {
    public void replaceNestedArrayToFlattedArray(Object[] nestedArray, List list) {
        for (int i = 0; i < nestedArray.length; i++) {
            if (nestedArray[i] instanceof Object[]) {
                replaceNestedArrayToFlattedArray((Object[]) nestedArray[i], list);
            } else {
                if (nestedArray[i] instanceof Integer)
                    list.add(nestedArray[i]);
            }
        }
    }
}
