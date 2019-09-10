package com.algorithms.linked_list;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class ReturnKthTest {
    @Test
    public void returnThToLast() {
        ReturnKth returnTth = new ReturnKth();
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("e");
        linkedList.add("d");
        Assert.assertEquals("d", returnTth.returnThToLast(linkedList));
    }
}
