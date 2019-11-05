package com.algorithms.array_and_strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayManipulationTest {

    ArrayManipulation arrayManipulation;

    @Before
    public void setUp() throws Exception {
        arrayManipulation = new ArrayManipulation();
    }

    @Test
    public void arrayManipulationCase01() {
        long[][] arr = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}
        };
        int n = 10;
        Assert.assertEquals(10, arrayManipulation.arrayManipulation(n, arr));
    }

    @Test
    public void arrayManipulationCase02() {
        long[][] arr = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };
        int n = 5;
        Assert.assertEquals(200, arrayManipulation.arrayManipulation(n, arr));
    }

    @Test
    public void arrayManipulationCase03() {
        long[][] arr = {
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15}
        };
        int n = 10;
        Assert.assertEquals(31, arrayManipulation.arrayManipulation(n, arr));
    }

    @Test
    public void arrayManipulationCase04() {
        long[][] arr = new long[30000][3];
        String fileName = "/src/resources/input04.txt";
        String line = null;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(System.getProperty("user.dir") + fileName);
            // Always wrap FileReader in BufferedReader.
            bufferedReader = new BufferedReader(fileReader);
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.split(" ");
                arr[i][0] = Integer.parseInt(splitLine[0]);
                arr[i][1] = Integer.parseInt(splitLine[1]);
                arr[i][2] = Integer.parseInt(splitLine[2]);
                i++;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int n = 4000;
        Assert.assertEquals(7542539201L, arrayManipulation.arrayManipulation(n, arr));
    }

    @Test
    public void arrayManipulationCase05() {
        long[][] arr = new long[10000000][3];
        String fileName = "/src/resources/input13.txt";
        String line = null;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(System.getProperty("user.dir") + fileName);
            bufferedReader = new BufferedReader(fileReader);
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.split(" ");
                arr[i][0] = Integer.parseInt(splitLine[0]);
                arr[i][1] = Integer.parseInt(splitLine[1]);
                arr[i][2] = Integer.parseInt(splitLine[2]);
                i++;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int n = 10000000;
        Assert.assertEquals(2490686975L, arrayManipulation.arrayManipulation(n, arr));
    }
}