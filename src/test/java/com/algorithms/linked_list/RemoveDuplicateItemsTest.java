package com.algorithms.linked_list;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class RemoveDuplicateItemsTest {
    @Test
    public void removeDuplicates() {
        RemoveDuplicateItems removeDuplicateItems = new RemoveDuplicateItems();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(13);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(1);
        linkedList.add(3);
        LinkedList<Integer> linkedListResult = new LinkedList<Integer>();
        linkedListResult.add(13);
        linkedListResult.add(1);
        linkedListResult.add(8);
        linkedListResult.add(3);
        Assert.assertEquals(linkedListResult, removeDuplicateItems.removeDuplicates(linkedList));
    }
}
