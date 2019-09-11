package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class TwoDArrayDSTest {
    @Test
    public void hourglassSum() {
        TwoDArrayDS twoD = new TwoDArrayDS();
        int[][] arr = {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};

        Assert.assertEquals(19, twoD.hourglassSum(arr));
    }
}
