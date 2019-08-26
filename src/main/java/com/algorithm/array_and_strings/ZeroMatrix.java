package com.algorithm.array_and_strings;

public class ZeroMatrix {
    /**
     * @param matrix
     * @return
     */
    public int[][] applyZeroToRowAndColumn(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i])
                nullifyRow(matrix, i);
        }
        for (int i = 0; i < column.length; i++) {
            if (column[i])
                nullifyColumn(matrix, i);
        }
        return matrix;
    }

    /**
     * @param matrix
     * @param row
     */
    private void nullifyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    /**
     * @param matrix
     * @param column
     */
    private void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }
}
