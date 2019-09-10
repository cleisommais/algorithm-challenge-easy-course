package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {
    @Test
    public void numberOfValleys() {
        CountingValleys countingValleys = new CountingValleys();
        int n = 8;
        String s = "UUUUDDUUDDDDDDUU";
        Assert.assertEquals(1, countingValleys.numberOfValleys(n, s));
    }
}
