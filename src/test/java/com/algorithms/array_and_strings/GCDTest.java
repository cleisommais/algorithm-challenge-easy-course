package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class GCDTest {
    @Test
    public void generalizedGCD() {
        GCD gcd = new GCD();
        int[] arr = {2, 3, 4, 5, 6};
        int num = 5;
        Assert.assertEquals(1, gcd.generalizedGCD(num, arr));
    }
}
