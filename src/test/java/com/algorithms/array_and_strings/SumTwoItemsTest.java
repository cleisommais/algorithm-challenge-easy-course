package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class SumTwoItemsTest {
    @Test
    public void twoIceCreamsByMoney() {
        SumTwoItems sum = new SumTwoItems();
        int[] flavorsValue = {5, 5, 9, 4, 2, 7, 5};
        int money = 13;
        Assert.assertEquals(2, sum.twoIceCreamsByMoney(flavorsValue, money)[0]);
        Assert.assertEquals(3, sum.twoIceCreamsByMoney(flavorsValue, money)[1]);
    }
}
