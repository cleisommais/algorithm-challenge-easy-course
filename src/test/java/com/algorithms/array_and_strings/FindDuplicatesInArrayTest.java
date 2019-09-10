package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class FindDuplicatesInArrayTest {
    @Test
    public void showDuplicatesWithinArray() {
        FindDuplicatesInArray find = new FindDuplicatesInArray();
        int[] array = {-3, 12, 16, 5, -3, 14, 99, 5};
        String[] duplicates = {"-3", "5"};
        Assert.assertEquals(duplicates, find.showDuplicatesWithinArray(array));
    }
}
