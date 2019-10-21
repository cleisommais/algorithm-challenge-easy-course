package com.algorithms.array_and_strings;

import com.algorithms.utils.DoublyLinkedList;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String... args) {
        Object[] nestedArray = {new Object[]{1, 2, new Object[]{3}}, 4};

    }


    public static Stream<?> findNestedArray(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[] ? findNestedArray((Object[]) o) : Stream.of(o));
    }


    public static void testLinkedList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> list2 = new DoublyLinkedList<>();
        list.insertAtTail(0);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(4);
        list2.insertAtTail(3);
        list2.insertAtTail(4);
        list2.insertAtTail(5);
        list2.insertAtTail(0);
        list.print();
        list2.print();
        DoublyLinkedList<Integer> list3 = list.union(list, list2);
        list3.print();
        list3.removeDuplicates(list3);
        list3.print();

    }

    public static void maxMin(int[] arr) {
        int size = arr.length;
        int[] arr1 = new int[size];
        for (int i = 0, j = 0; j < size - 1; i++, j++) {
            arr1[i] = arr[(size - 1) - j];
            if (i == size - 1) {
                break;
            }
            arr1[i + 1] = arr[j];
            i++;
        }
        for (int i = 0; i < size; i++) {
            arr[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reArrange(int[] arr) {
        int temp = 0;
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                newArr[j++] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                newArr[j++] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reArrange(int[] arr, int begin, int end) {
        int temp = 0;
        if (begin == arr.length / 2)
            return;
        if (arr[begin] > 0 && arr[end] < 0) {
            temp = arr[end];
            arr[end] = arr[begin];
            arr[begin] = temp;
        }
        reArrange(arr, ++begin, --end);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr) {
        // Write - Your - Code
        int temp = 0;
        temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static int findSecondMaximum(int[] arr) {
        // Write - Your - Code
        int secondMaximum = 0;
        int firstMaximum = 0;
        if (arr.length == 1)
            return arr[0];
        if (arr[0] > arr[1]) {
            firstMaximum = arr[0];
            secondMaximum = arr[1];
        } else {
            firstMaximum = arr[1];
            secondMaximum = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (secondMaximum < arr[i])
                secondMaximum = arr[i];
            if (firstMaximum < arr[i]) {
                secondMaximum = firstMaximum;
                firstMaximum = arr[i];
            }
        }
        return secondMaximum;
    }

    public static int findFirstUnique(int[] arr) {
        int result = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int value : arr) {
            Integer count = 1;
            if (map.containsKey(value))
                count++;
            map.put(value, count);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static int findMinimum(int[] arr) {
        // Write your code here
        int smallest = arr[0];
        for (int value : arr) {
            if (smallest > value)
                smallest = value;
        }
        return smallest;
    }

    public static int[] findProduct(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        result[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            result[i] = nums[i + 1] * result[i + 1];
        }
        int left = 1;
        for (int i = 0; i < size; i++) {
            result[i] = result[i] * left;
            left = nums[i] * left;
        }
        return result;
    }

    public static int[] findSum(int[] arr, int n) {
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int difference = n - arr[i];
            if (temp.contains(difference)) {
                return new int[]{difference, arr[i]};
            }
            temp.add(arr[i]);
        }
        return new int[0];  // return the elements in the array whose sum is equal to the value passed as parameter
    }
}
