package com.algorithms.tree;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

    BinarySearchTree tree;
    BinarySearchTreeChallenges binarySearchTreeChallenges;

    @Before
    public void setUp() throws Exception {
        tree = new BinarySearchTree();
        binarySearchTreeChallenges = new BinarySearchTreeChallenges();
    }

    @Test
    public void add() {
        tree.add(6);
        tree.add(4);
        tree.add(9);
        tree.add(2);
        tree.add(5);
        tree.add(8);
        tree.add(8);
        tree.add(12);
        tree.add(10);
        tree.add(14);
        tree.printTree(tree.getRoot());
        System.out.println();
        binarySearchTreeChallenges.findAncestors(tree.getRoot(), 8);
        System.out.println();
        binarySearchTreeChallenges.findAncestors(tree.getRoot(), 14);

    }
}
