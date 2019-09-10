package com.algorithms.linked_list;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class DeleteMiddleNodeTest {
    @Test
    public void deleteMiddleNode() {

        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        Assert.assertEquals(new String[]{"a", "b", "d", "e"}, deleteMiddleNode.deleteMiddleNode(linkedList).toArray());

    }
}
