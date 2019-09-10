package com.algorithms.utils;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void push() {
        LinkedList<String> list = new LinkedList<>();
        list.push("A");
        Assert.assertEquals(true, list.isExist("A"));
    }

    @Test
    public void isExist() {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        Assert.assertEquals(true, list.isExist(2));
    }

    @Test
    public void deleteDublicates() {
        LinkedList<String> list = new LinkedList<>();
        list.push("A");
        list.push("A");
        list.push("C");
        list.push("D");
        LinkedList<String> result = new LinkedList<>();
        result.push("A");
        result.push("C");
        result.push("D");
        Assert.assertEquals(result.size, list.deleteDublicates().size);
    }

    @Test
    public void getKthToLastTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.getKthToLast(0);
    }
}