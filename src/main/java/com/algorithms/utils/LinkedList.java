package com.algorithms.utils;

public class LinkedList<T> {
    public Node head;
    public int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void insertAtEnd(T data) {
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        size++;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void delete(T data) {
        if (isEmpty()) {
            return;
        }
        Node currentNode = head;
        Node prevNode = null;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                prevNode.next = currentNode.next;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public boolean search(T data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // Helper Function to printList
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = head;
        System.out.print("List : ");
        while (temp.next != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data.toString() + " -> null");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public class Node {
        public T data;
        public Node next;
    }
}
