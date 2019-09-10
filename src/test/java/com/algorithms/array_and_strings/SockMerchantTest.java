package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest {
    @Test
    public void numberOfPairs() {
        SockMerchant sock = new SockMerchant();
        int[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20, 20, 50};
        int quantity = 9;
        Assert.assertEquals(5, sock.numberOfPairs(quantity, array));
    }
}
