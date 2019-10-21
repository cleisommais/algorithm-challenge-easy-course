package com.algorithms;

import com.algorithms.utils.DoublyLinkedList;
import com.algorithms.utils.Graph;
import com.algorithms.utils.Queue;
import com.algorithms.utils.Stack;

import java.util.Arrays;

public class GraphChallenges {

    public static boolean detectCycle(Graph g) {
        int num_of_vertices = g.vertices;

        //Boolean Array to hold the history of visited nodes (by default-false)
        boolean[] visited = new boolean[num_of_vertices];
        //Holds a flag if the node is currently in Stack or not (by default- false)
        boolean[] stackFlag = new boolean[num_of_vertices];

        for (int i = 0; i < num_of_vertices; i++) {
            //Check cyclic on each node
            if (cyclic(g, i, visited, stackFlag)) {
                return true;
            }
        }
        return false;
    }

    public static boolean cyclic(Graph g, Integer v, boolean[] visited, boolean[] stackFlag) {
        //if node is currently in stack that means we have found a cycle
        if (stackFlag[v])
            return true;

        //if it is already visited (and not in Stack) then there is no cycle
        if (visited[v])
            return false;

        visited[v] = true;
        stackFlag[v] = true;

        // check adjacency list of the node
        DoublyLinkedList.Node temp = null;
        if (g.adjacencyLinkedList[v] != null)
            temp = g.adjacencyLinkedList[v].getHead();

        while (temp != null) {
            //run cyclic function recursively on each outgowing path
            if (cyclic(g, (Integer) temp.data, visited, stackFlag)) {
                return true;
            }
            temp = temp.next;
        }
        stackFlag[v] = false;

        return false;
    }

    public String breadthFirstSearch(Graph graph, int source) {
        Queue queueMain = new Queue(graph.vertices);
        Queue queueResult = new Queue(graph.vertices);
        queueMain.enqueue(source);
        boolean[] visited = new boolean[graph.vertices];
        visited[source] = true;
        while (!queueMain.isEmpty()) {
            Integer currentNode = (Integer) queueMain.dequeue();
            queueResult.enqueue(currentNode);
            DoublyLinkedList.Node temp = null;
            if (graph.adjacencyLinkedList[currentNode] != null) {
                temp = graph.adjacencyLinkedList[currentNode].getHead();
            }
            while (temp != null) {
                if (!visited[(int) temp.data]) {
                    queueMain.enqueue(temp.data);
                    visited[currentNode] = true;
                }
                temp = temp.next;
            }
        }
        return Arrays.toString(queueResult.getArray());
    }

    public String depthFirstSearch(Graph graph, int source) {
        Stack stack = new Stack(graph.vertices);
        Queue queue = new Queue(graph.vertices);
        boolean[] visited = new boolean[graph.vertices];
        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            Integer currentNode = (Integer) stack.pop();
            queue.enqueue(currentNode);
            DoublyLinkedList.Node temp = null;
            if (graph.adjacencyLinkedList[currentNode] != null) {
                temp = graph.adjacencyLinkedList[currentNode].getHead();
            }
            while (temp != null) {
                if (!visited[(int) temp.data]) {
                    stack.push(temp.data);
                    visited[currentNode] = true;
                } else {

                }
                temp = temp.next;
            }
        }
        return Arrays.toString(queue.getArray());
    }

    public boolean detectCycle(Graph graph, int source) {
        Stack stack = new Stack(graph.vertices);
        Queue queue = new Queue(graph.vertices);
        boolean[] visited = new boolean[graph.vertices];
        stack.push(source);
        visited[source] = true;
        boolean response = false;
        int countCycle = 0;
        while (!stack.isEmpty()) {
            Integer currentNode = (Integer) stack.pop();
            queue.enqueue(currentNode);
            DoublyLinkedList.Node temp = null;
            if (graph.adjacencyLinkedList[currentNode] != null) {
                temp = graph.adjacencyLinkedList[currentNode].getHead();
            }
            while (temp != null) {
                if (!visited[(int) temp.data]) {
                    stack.push(temp.data);
                    visited[currentNode] = true;
                } else {
                    response = true;
                    countCycle++;
                }
                temp = temp.next;
            }
        }
        return response;
    }
}
