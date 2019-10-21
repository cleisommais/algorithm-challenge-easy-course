package com.algorithms.utils;

public class DoublyLinkedList<T> {
    private int size;
    private transient Node head;
    private transient Node tail;

    public DoublyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }


    private boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.err.println("List is empty!!!");
            return;
        }
        Node node = head;
        System.out.print("NULL <= ");
        while (node.next != null) {
            System.out.print(node.data + " <=> ");
            node = node.next;
        }
        System.out.print(node.data);
        System.out.println(" => NULL");
    }

    public void printReversed() {
        if (isEmpty()) {
            System.err.println("List is empty!!!");
            return;
        }
        Node node = tail;
        System.out.print("NULL <= ");
        while (node.prev != null) {
            System.out.print(node.data + " <=> ");
            node = node.prev;
        }
        System.out.print(node.data);
        System.out.println(" => NULL");
    }

    public void reverse(DoublyLinkedList<T> list) {
        if (list.isEmpty()) {
            System.err.println("List is empty!!!");
            return;
        }
        DoublyLinkedList.Node next = null;
        DoublyLinkedList.Node current = list.head;
        DoublyLinkedList.Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
    }

    public boolean detectLoop(DoublyLinkedList<T> list) {
        if (list.isEmpty()) {
            System.err.println("List is empty!!!");
            return false;
        }
        DoublyLinkedList.Node slow = list.head;
        DoublyLinkedList.Node fast = list.head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("There is loop!!!");
                return true;
            }
        }
        System.err.println("No loop found!!!");
        return false;
    }

    public T findMiddleValue(DoublyLinkedList<T> list) {
        if (list.isEmpty()) {
            System.err.println("List is empty!!!");
            return null;
        }
        DoublyLinkedList<T>.Node<T> middle = list.head;
        DoublyLinkedList<T>.Node<T> current = list.head;
        while (middle != null && current != null && current.next != null) {
            current = current.next.next;
            if (current != null)
                middle = middle.next;
        }
        System.out.println("The middle data is: " + middle.data);
        return middle.data;
    }

    public void removeDuplicates(DoublyLinkedList<T> list) {
        if (list.isEmpty()) {
            System.err.println("List is empty!!!");
            return;
        }
        DoublyLinkedList<T>.Node<T> compare = null;
        DoublyLinkedList<T>.Node<T> current = list.head;
        while (current != null && current.next != null) {
            compare = current;
            while (compare.next != null) {
                if (current.data.equals(compare.next.data)) {
                    compare.next = compare.next.next;
                } else {
                    compare = compare.next;
                }
            }
            current = current.next;
        }
    }

    public DoublyLinkedList<T> union(DoublyLinkedList<T> list1, DoublyLinkedList<T> list2) {
        if (list1.isEmpty() || list2.isEmpty()) {
            System.err.println("Lists are empty!!!");
            return null;
        }
        DoublyLinkedList<T> result = new DoublyLinkedList<>();
        Node<T> compare = list1.head;
        Node<T> current = list2.head;
        while (current != null) {
            result.insertAtHead(current.data);
            current = current.next;
        }
        while (compare != null) {
            result.insertAtHead(compare.data);
            compare = compare.next;
        }
        return result;
    }

    public DoublyLinkedList<T> intersection(DoublyLinkedList<T> list1, DoublyLinkedList<T> list2) {
        DoublyLinkedList<T> result = new DoublyLinkedList<>();
        Node<T> current = list2.head;
        while (current != null) {
            Node<T> compare = list1.head;
            while (compare != null) {
                if (current.data.equals(compare.data))
                    result.insertAtHead(compare.data);
                compare = compare.next;
            }
            current = current.next;
        }
        return result;
    }

    public boolean search(T data) {
        if (isEmpty()) {
            System.err.println("List is empty!!!");
            return false;
        }
        Node node = head;
        while (node != null) {
            if (data.equals(node.data)) {
                System.out.println("Item found: " + data);
                return true;
            }
            node = node.next;
        }
        System.out.println("Item not found!!!");
        return false;
    }

    public void insertAtHead(T data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        node.prev = null;
        if (isEmpty())
            tail = node;
        else
            head.prev = node;
        head = node;
        size++;
    }

    public void insertAtTail(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.prev = tail;
        if (isEmpty())
            head = node;
        else
            tail.next = node;
        tail = node;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            System.err.println("List is empty!!!");
            return;
        }
        head = head.next;
        if (head == null)
            tail = null;
        else
            head.prev = null;
        size--;
    }

    public void deleteAtTail() {
        if (isEmpty()) {
            System.err.println("List is empty!!!");
            return;
        }
        tail = tail.prev;
        if (tail == null)
            head = null;
        else
            tail.next = null;
        size--;
    }

    public void deleteByValue(T data) {
        if (isEmpty()) {
            System.err.println("List is empty!!!");
            return;
        }
        Node node = head;
        if (getSize() == 1 && data.equals(node.data)) {
            deleteAtHead();
            return;
        }
        while (node != null) {
            if (data.equals(node.data)) {
                System.out.println("Deleted item: " + data);
                if (node.prev != null) {
                    node.prev.next = node.next;
                }
                if (node.next != null) {
                    node.next.prev = node.prev;
                }
                size--;
            }
            node = node.next;
        }
    }

    public class Node<T> {
        public T data;
        public Node next;
        public Node prev;
    }
}
