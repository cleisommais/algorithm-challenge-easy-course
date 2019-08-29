package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class OneAwayTest {

    @Test
    public void isOneEdit() {
        OneAway oneAway = new OneAway();
        String a = "pale";
        String b = "ple";
        Assert.assertEquals(true, oneAway.isOneEdit(a, b));
    }

    @Test
    public void isNotOneEdit() {
        OneAway oneAway = new OneAway();
        String a = "pale";
        String b = "bae";
        Assert.assertEquals(false, oneAway.isOneEdit(a, b));
    }
}