package com.algorithm.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPermutationTest {

    @Test
    public void hasPermutationTwoStrings() {
        CheckPermutation checkPermutation = new CheckPermutation();
        Assert.assertEquals(true, checkPermutation.hasPermutationTwoStrings("amor", "roma"));
    }

    @Test
    public void hasPermutationTwoStringsFaster() {
        CheckPermutation checkPermutation = new CheckPermutation();
        Assert.assertEquals(true, checkPermutation.hasPermutationTwoStringsFaster("amor", "roma"));
    }

    @Test
    public void hasNotPermutationTwoStrings() {
        CheckPermutation checkPermutation = new CheckPermutation();
        Assert.assertEquals(false, checkPermutation.hasPermutationTwoStrings("amox", "roma"));
    }

    @Test
    public void hasNotPermutationTwoStringsFaster() {
        CheckPermutation checkPermutation = new CheckPermutation();
        Assert.assertEquals(false, checkPermutation.hasPermutationTwoStringsFaster("amor", "romp"));
    }
}