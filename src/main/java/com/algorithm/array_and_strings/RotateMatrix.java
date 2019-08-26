package com.algorithm.array_and_strings;

public class RotateMatrix {
    public int[][] rotate90Degrees(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix.length != matrix[0].length)
            return new int[0][0];
        int length = matrix.length;
        for (int layer = 0; layer < length / 2; layer++) {
            int first = layer;
            int last = length - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                //left -> top
                matrix[first][i] = matrix[last - offset][first];

                //bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                //right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                //top -> right
                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}
