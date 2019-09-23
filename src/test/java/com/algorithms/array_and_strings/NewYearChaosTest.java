package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class NewYearChaosTest {
    @Test
    public void minimumBribes() {
        NewYearChaos newYearChaos = new NewYearChaos();
        int[] q = {2, 1, 5, 3, 4};
        Assert.assertEquals(3, newYearChaos.minimumBribes(q));
    }
}
