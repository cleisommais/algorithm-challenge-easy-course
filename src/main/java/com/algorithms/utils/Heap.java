package com.algorithms.utils;

import java.util.Arrays;

public class Heap {
    public static String minHeap(int[] array) {
        int size = array.length;
        for (int i = (size - 1) / 2; i >= 0; i--) {
            swapMin(array, i, size);
        }
        return Arrays.toString(array);
    }

    private static void swapMin(int[] array, int index, int size) {
        int smallest = index;
        while (smallest < size / 2) {
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;
            if (left < size && array[left] < array[index]) {
                smallest = left;
            }
            if (right < size && array[right] < array[smallest]) {
                smallest = right;
            }
            if (smallest != index) {
                int temp = array[index];
                array[index] = array[smallest];
                array[smallest] = temp;
                index = smallest;
            } else {
                break;
            }
        }
    }

    private static void swapMax(int[] array, int index, int size) {
        int largest = index;
        while (largest < size / 2) {
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;
            if (left < size && array[left] > array[index]) {
                largest = left;
            }
            if (right < size && array[right] > array[largest]) {
                largest = right;
            }
            if (largest != index) {
                int temp = array[index];
                array[index] = array[largest];
                array[largest] = temp;
                index = largest;
            } else {
                break;
            }
        }
    }

    public void maxHeap(int[] array) {
        int size = array.length;
        for (int i = (size - 1) / 2; i >= 0; i--) {
            swapMax(array, i, size);
        }
    }
}
