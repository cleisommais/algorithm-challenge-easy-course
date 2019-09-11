package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Test;

public class TwoDArrayDSTest {
    @Test
    public void hourglassSum() {
        TwoDArrayDS twoD = new TwoDArrayDS();
        int[][] arr = new int[6][6];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[0][3] = 0;
        arr[0][4] = 0;
        arr[0][5] = 0;
        arr[1][0] = 0;
        arr[2][1] = 1;
        arr[3][2] = 0;
        arr[4][3] = 0;
        arr[5][4] = 0;
        //arr[6][5] = 0;


        String[] arrRowItems = {"1", "1", "1", "0", "0", "0"};
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                //arr[i][j] = arrItem;
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }

        Assert.assertEquals(19, twoD.hourglassSum(arr));
    }
}
