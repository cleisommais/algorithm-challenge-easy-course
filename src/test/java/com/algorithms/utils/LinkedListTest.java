package com.algorithms.utils;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void search() {
        LinkedList<String> list = new LinkedList<>();
        list.insertAtHead("A");
        list.insertAtHead("B");
        list.insertAtHead("C");
        list.insertAtHead("D");
        list.insertAtHead("E");
        list.insertAtHead("F");
        list.insertAtEnd("G");
        list.printList();
        Assert.assertEquals(true, list.search("E"));
    }

    @Test
    public void delete() {
        LinkedList<String> list = new LinkedList<>();
        list.insertAtHead("A");
        list.insertAtHead("B");
        list.insertAtHead("C");
        list.insertAtHead("D");
        list.insertAtHead("E");
        list.insertAtHead("F");
        list.insertAtEnd("G");
        list.printList();
        Assert.assertEquals(true, list.search("G"));
        list.delete("G");
        list.printList();
        Assert.assertEquals(false, list.search("G"));
    }

}