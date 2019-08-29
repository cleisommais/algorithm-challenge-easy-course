package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class CheckPermutationTest {

    @Test
    public void hasPermutation() {
        CheckPermutation checkPermutation = new CheckPermutation();
        Assert.assertEquals(true, CheckPermutation.isPermutation("amor e roma"));
    }

    @Test
    public void hasNotPermutation() {
        CheckPermutation checkPermutation = new CheckPermutation();
        Assert.assertEquals(false, CheckPermutation.isPermutation("amor"));
    }

}