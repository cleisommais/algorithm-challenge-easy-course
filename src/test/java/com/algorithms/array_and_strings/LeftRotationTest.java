package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class LeftRotationTest {
    @Test
    public void rotLeft() {
        LeftRotation left = new LeftRotation();
        int[] a = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int d = 13;
        int[] output = {87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60};
        Assert.assertEquals(60, left.rotLeft(a, d));
    }
}
