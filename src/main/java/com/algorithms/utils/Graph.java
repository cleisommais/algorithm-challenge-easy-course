package com.algorithms.utils;

public class Graph<T> {
    public int vertices;
    public DoublyLinkedList<T>[] adjacencyLinkedList;

    public Graph(int vertices) {
        this.vertices = vertices;
        DoublyLinkedList<Integer>[] linkedList;
        adjacencyLinkedList = new DoublyLinkedList[vertices];
        for (int i = 0; i < adjacencyLinkedList.length; i++) {
            adjacencyLinkedList[i] = new DoublyLinkedList<T>();
        }
    }

    public void addEdge(int source, T destination) {
        adjacencyLinkedList[source].insertAtTail(destination);
    }

    public void removeEdge(int source, T destination) {
        adjacencyLinkedList[source].deleteByValue(destination);
    }

    public boolean search(int source, T destination) {
        return adjacencyLinkedList[source].search(destination);
    }

    public void printGraph() {
        System.out.println(">>Adjacency List of Directed Graph<<");
        for (int i = 0; i < adjacencyLinkedList.length; i++) {
            if (adjacencyLinkedList[i] != null) {
                System.out.print("[" + i + "] => ");
                DoublyLinkedList.Node temp = adjacencyLinkedList[i].getHead();
                while (temp != null) {
                    System.out.print("(" + temp.data + ") -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            } else {
                System.out.println("[" + i + "] => " + "null");
            }
        }
    }
}
