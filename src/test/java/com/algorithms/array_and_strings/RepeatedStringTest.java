package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {
    @Test
    public void repeatedString() {
        RepeatedString repeatedString = new RepeatedString();
        String s = "a";
        long n = Long.parseLong("1000000000000");
        long response = Long.parseLong("1000000000000");
        Assert.assertEquals(response, repeatedString.repeatedString(s, n));

    }
}
