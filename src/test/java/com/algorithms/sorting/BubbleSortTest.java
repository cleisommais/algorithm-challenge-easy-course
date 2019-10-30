package com.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

public class BubbleSortTest {

    BubbleSort bubbleSort;

    @Before
    public void setUp() throws Exception {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void countSwapsCase01() {
        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);
        int[] array = {5, 4, 3, 2, 1};
        bubbleSort.countSwaps(array);
        Mockito.verify(out).println("Array is sorted in 10 swaps.");
        Mockito.verify(out).println("First Element: 1");
        Mockito.verify(out).println("Last Element: 5");
    }

    @Test
    public void countSwapsCase02() {
        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);
        int[] array = {1, 2, 3, 4, 5};
        bubbleSort.countSwaps(array);
        Mockito.verify(out).println("Array is sorted in 0 swaps.");
        Mockito.verify(out).println("First Element: 1");
        Mockito.verify(out).println("Last Element: 5");
    }

    @Test
    public void countSwapsCase03() {
        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);
        int[] array = {6, 4, 1};
        bubbleSort.countSwaps(array);
        Mockito.verify(out).println("Array is sorted in 3 swaps.");
        Mockito.verify(out).println("First Element: 1");
        Mockito.verify(out).println("Last Element: 6");
    }
}
