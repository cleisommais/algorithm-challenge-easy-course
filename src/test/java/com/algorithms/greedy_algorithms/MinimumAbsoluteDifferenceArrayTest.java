package com.algorithms.greedy_algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumAbsoluteDifferenceArrayTest {

    MinimumAbsoluteDifferenceArray minimumAbsoluteDifferenceArray;

    @Before
    public void setUp() throws Exception {
        minimumAbsoluteDifferenceArray = new MinimumAbsoluteDifferenceArray();
    }

    @Test
    public void minimumAbsoluteDifferenceCase01() {
        int[] array = {3, -7, 0};
        Assert.assertEquals(3, minimumAbsoluteDifferenceArray.minimumAbsoluteDifference(array));
    }

    @Test
    public void minimumAbsoluteDifferenceCase02() {
        int[] array = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        Assert.assertEquals(1, minimumAbsoluteDifferenceArray.minimumAbsoluteDifference(array));
    }

    @Test
    public void minimumAbsoluteDifferenceCase03() {
        int[] array = {1, -3, 71, 68, 17};
        Assert.assertEquals(3, minimumAbsoluteDifferenceArray.minimumAbsoluteDifference(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void minimumAbsoluteDifferenceCase04() {
        int[] array = {};
        minimumAbsoluteDifferenceArray.minimumAbsoluteDifference(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minimumAbsoluteDifferenceCase05() {
        int[] array = {1};
        minimumAbsoluteDifferenceArray.minimumAbsoluteDifference(array);
    }
}