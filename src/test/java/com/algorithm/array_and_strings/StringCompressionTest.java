package com.algorithm.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class StringCompressionTest {
    @Test
    public void compressTest() {
        StringCompression stringCompression = new StringCompression();
        Assert.assertEquals("a3b1c5a3d4f1", stringCompression.compress("aaabcccccaaaddddf"));
    }
}
