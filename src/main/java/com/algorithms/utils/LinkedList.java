package com.algorithms.utils;

import com.sun.istack.internal.NotNull;

import java.util.HashSet;

public class LinkedList<T> {
    transient int size = 0;
    transient private Node<T> first;

    public boolean isExist(@NotNull T item) {
        return node(item) != null;
    }

    public LinkedList<T> deleteDublicates() {
        HashSet<T> set = new HashSet<>();
        LinkedList<T> list = new LinkedList<>();
        Node<T> first = this.first;
        Node<T> previous = null;
        while (first != null) {
            if (set.contains(first.item)) {
                previous.next = first.next;
            } else {
                set.add(first.item);
                previous = first;
            }
            first = first.next;
        }
        for (T t : set) {
            list.push(t);
        }
        return list;
    }

    public Node<T> getKthToLast(int k) {
        Node<T> node = first;
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        if (len < k)
            return null;
        node = first;
        for (int i = 1; i < len - k + 1; i++) {
            System.out.println(node.item);
            node = node.next;
        }

        return node;
    }

    private Node<T> node(@NotNull T item) {
        Node<T> node = first;
        while (node != null) {
            if (item.equals(node.item)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void push(@NotNull T item) {
        size++;
        Node<T> newNode = new Node<>(item, size);
        newNode.next = first;
        first = newNode;
    }

    static class Node<T> {
        T item;
        Node<T> next;
        int index;

        Node(T element, int index) {
            this.item = element;
            this.next = null;
            this.index = index;
        }
    }
}
