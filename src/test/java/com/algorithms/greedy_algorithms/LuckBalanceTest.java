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
        int k = 2;
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
    public void luckBalanceCase05() {
        int k = 0;
        int[][] contests = {{5, 1}};
        luckBalance.luckBalance(k, contests);
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
}