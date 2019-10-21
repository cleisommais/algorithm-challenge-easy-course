package com.algorithms.utils.graph;

import com.algorithms.GraphChallenges;
import com.algorithms.utils.Graph;
import org.junit.Before;
import org.junit.Test;

public class GraphTest {

    Graph<Integer> graph;
    GraphChallenges graphChallenges;

    @Before
    public void setUp() throws Exception {
        graph = new Graph(5);
        graphChallenges = new GraphChallenges();
    }

    @Test
    public void addEdge() {
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);

        graph.printGraph();

        System.out.println("BFS: " + graphChallenges.breadthFirstSearch(graph, 0));

        System.out.println("DFS: " + graphChallenges.depthFirstSearch(graph, 0));

        System.out.println("Has cycles? " + graphChallenges.detectCycle(graph, 0));

        System.out.println(GraphChallenges.detectCycle(graph));

    }
}
