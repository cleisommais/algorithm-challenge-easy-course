package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class EightHousesTest {
    @Test
    public void cellCompete() {
        EightHouses eh = new EightHouses();
        int[] states = {1, 0, 0, 0, 0, 1, 0, 0};
        //output1 0,1,0,0,1,0,1,0
        Assert.assertEquals(0, eh.cellCompete(states, 2));
    }

}
