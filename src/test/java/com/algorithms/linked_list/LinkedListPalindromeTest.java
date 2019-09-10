package com.algorithms.linked_list;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListPalindromeTest {
    @Test
    public void isPalindrome() {
        LinkedListPalindrome listPalindrome = new LinkedListPalindrome();
        LinkedList<Integer> list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(0);
        Assert.assertEquals(true, listPalindrome.isPalindrome(list));
    }
}
