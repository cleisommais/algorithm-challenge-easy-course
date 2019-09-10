package com.algorithms.linked_list;

import java.util.LinkedList;

public class DeleteMiddleNode {
    public LinkedList<String> deleteMiddleNode(LinkedList<String> linkedList) {
        int length = linkedList.size();
        int middle = Math.round(length / 2);
        linkedList.remove(middle);
        System.out.println(linkedList);
        return linkedList;
    }
}
