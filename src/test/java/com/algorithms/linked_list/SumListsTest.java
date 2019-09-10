package com.algorithms.linked_list;


import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class SumListsTest {
    @Test
    public void sumTwoDigits() {
        SumLists sumLists = new SumLists();
        LinkedList<Integer> list01 = new LinkedList();
        list01.add(7);
        list01.add(1);
        list01.add(6);
        LinkedList<Integer> list02 = new LinkedList();
        list02.add(5);
        list02.add(9);
        list02.add(2);
        LinkedList<Integer> result = new LinkedList();
        result.add(2);
        result.add(1);
        result.add(9);
        Assert.assertEquals(result, sumLists.sumDigits(list01, list02));
    }
}
