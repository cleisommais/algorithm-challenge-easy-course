package com.algorithm.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class RotateMatrixTest {
    @Test
    public void rotate90Degrees() {
        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] result = {{3, 1}, {4, 2}};
        Assert.assertEquals(result, rotateMatrix.rotate90Degrees(matrix));
    }

}
