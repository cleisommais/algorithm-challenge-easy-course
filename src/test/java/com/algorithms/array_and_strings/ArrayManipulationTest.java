package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayManipulationTest {

    ArrayManipulation arrayManipulation;

    @Before
    public void setUp() throws Exception {
        arrayManipulation = new ArrayManipulation();
    }

    @Test
    public void arrayManipulationCase01() {
        int[][] arr = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};
        int n = 10;
        Assert.assertEquals(10, arrayManipulation.arrayManipulation(n, arr));
    }
}