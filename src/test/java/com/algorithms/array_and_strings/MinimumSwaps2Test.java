package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumSwaps2Test {

    MinimumSwaps2 minimumSwaps2;

    @Before
    public void setUp() throws Exception {
        minimumSwaps2 = new MinimumSwaps2();
    }

    @Test
    public void minimumSwapsCase01() {
        int[] arr = {4, 3, 1, 2};
        Assert.assertEquals(3, minimumSwaps2.minimumSwaps(arr));
    }

    @Test
    public void minimumSwapsCase02() {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        Assert.assertEquals(3, minimumSwaps2.minimumSwaps(arr));
    }

    @Test
    public void minimumSwapsCase03() {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        Assert.assertEquals(5, minimumSwaps2.minimumSwaps(arr));
    }
}