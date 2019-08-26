package com.algorithm.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class StringRotationTest {
    @Test
    public void isSubstringFromSubstring() {
        StringRotation stringRotation = new StringRotation();
        String stringA = "waterbottle";
        String stringB = "erbottlewat";
        Assert.assertEquals(true, stringRotation.isRotation(stringA, stringB));
    }
}
