package com.algorithms.tree;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

    BinarySearchTree binarySearchTree;

    @Before
    public void setUp() throws Exception {
        binarySearchTree = new BinarySearchTree();
    }

    @Test
    public void add() {
        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(9);
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(8);
        binarySearchTree.add(12);
        binarySearchTree.add(10);
        binarySearchTree.add(14);
        binarySearchTree.printTree(binarySearchTree.getRoot());
        System.out.println();
        System.out.println(binarySearchTree.search(12).getData());
        binarySearchTree.delete(12, binarySearchTree.getRoot());
        binarySearchTree.delete(5, binarySearchTree.getRoot());
        binarySearchTree.delete(8, binarySearchTree.getRoot());
        binarySearchTree.printTree(binarySearchTree.getRoot());
    }
}
