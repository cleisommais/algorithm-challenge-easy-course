package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheCloudsTest {
    @Test
    public void jumpingOnClouds() {
        JumpingOnTheClouds jumpingOnTheClouds = new JumpingOnTheClouds();
        int[] c = {0, 1, 0, 0, 0, 1, 0};
        Assert.assertEquals(3, jumpingOnTheClouds.jumpingOnClouds(c));
    }
}
