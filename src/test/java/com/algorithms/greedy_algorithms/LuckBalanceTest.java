package com.algorithms.greedy_algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LuckBalanceTest {
    LuckBalance luckBalance;

    @Before
    public void setUp() throws Exception {
        luckBalance = new LuckBalance();
    }

    @Test
    public void luckBalanceCase01() {
        int k = 1;
        int[][] contests = {
                {5, 1},
                {1, 1},
                {4, 0}};
        Assert.assertEquals(8, luckBalance.luckBalance(k, contests));
    }

    @Test
    public void luckBalanceCase02() {
        int k = 3;
        int[][] contests = {
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0}};
        Assert.assertEquals(29, luckBalance.luckBalance(k, contests));
    }

    @Test
    public void luckBalanceCase03() {
        int k = 2;
        int[][] contests = {
                {5, 1},
                {4, 0},
                {6, 1},
                {2, 1},
                {8, 0}};
        Assert.assertEquals(21, luckBalance.luckBalance(k, contests));
    }

    @Test
    public void luckBalanceCase04() {
        int k = 5;
        int[][] contests = {
                {13, 1},
                {10, 1},
                {9, 1},
                {8, 1},
                {13, 1},
                {12, 1},
                {18, 1},
                {13, 1},};
        Assert.assertEquals(42, luckBalance.luckBalance(k, contests));
    }

    @Test(expected = IllegalArgumentException.class)
    public void luckBalanceCase06() {
        int k = 3;
        int[][] contests = {};
        luckBalance.luckBalance(k, contests);
    }

    @Test(expected = IllegalArgumentException.class)
    public void luckBalanceCase07() {
        int k = 3;
        int[][] contests = {{}};
        luckBalance.luckBalance(k, contests);
    }

    @Test
    public void luckBalanceCase05() {
        int k = 0;
        int[][] contests = {
                {9709, 1},
                {9704, 1},
                {9080, 1},
                {9060, 1},
                {9467, 1},
                {9847, 1},
                {9590, 1},
                {9225, 1},
                {9304, 1},
                {9527, 1},
                {9329, 1},
                {9962, 1},
                {9928, 1},
                {9525, 1},
                {9491, 1},
                {9993, 1},
                {9829, 1},
                {9153, 1},
                {9936, 1},
                {9899, 1},
                {9312, 1},
                {9862, 1},
                {9610, 1},
                {9502, 1},
                {9522, 1},
                {9359, 1},
                {9617, 1},
                {9431, 1},
                {9757, 1},
                {9292, 1},
                {9875, 1},
                {9041, 1},
                {9626, 1},
                {9656, 1},
                {9893, 1},
                {9442, 1},
                {9369, 1},
                {9282, 1},
                {9117, 1},
                {9245, 1},
                {9841, 1},
                {9715, 1},
                {9778, 1},
                {9150, 1},
                {9738, 1},
                {9699, 1},
                {9642, 1},
                {9517, 1},
                {9407, 1},
                {9675, 1},
                {9918, 1},
                {9031, 1},
                {9369, 1},
                {9935, 1},
                {9868, 1},
                {9934, 1},
                {9660, 1},
                {9931, 1},
                {9273, 1},
                {9168, 1},
                {9404, 1},
                {9017, 1},
                {9288, 1},
                {9532, 1},
                {9700, 1},
                {9291, 1},
                {9126, 1},
                {9782, 1},
                {9545, 1},
                {9076, 1},
                {9346, 1},
                {9018, 1},
                {9732, 1},
                {9032, 1},
                {9992, 1},
                {9630, 1},
                {9952, 1},
                {9885, 1},
                {9328, 1},
                {9419, 1},
                {9705, 1},
                {9611, 1},
                {9440, 1},
                {9907, 1},
                {9303, 1},
                {9449, 1},
                {9876, 1},
                {9335, 1},
                {9723, 1},
                {9698, 1},
                {9823, 1},
                {9070, 1},
                {9258, 1},
                {9102, 1},
                {9370, 1},
                {9788, 1},
                {9725, 1},
                {9811, 1},
                {9474, 1},
                {9602, 1},
        };
        Assert.assertEquals(-953782, luckBalance.luckBalance(k, contests));
    }
}