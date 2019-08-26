package com.algorithm.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class ZeroMatrixTest {

    @Test
    public void applyZeroToRowAndColumn() {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        int[][] matrix = {{1, 2, 3}, {0, 1, 2}};
        int[][] result = {{0, 2, 3}, {0, 0, 0}};
        Assert.assertEquals(result, zeroMatrix.applyZeroToRowAndColumn(matrix));
    }
}
