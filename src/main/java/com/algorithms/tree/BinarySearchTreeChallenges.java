package com.algorithms.tree;

public class BinarySearchTreeChallenges {
    int count = 0;
    private BinarySearchTree binarySearchTree;

    public BinarySearchTreeChallenges() {
        binarySearchTree = new BinarySearchTree();
    }

    public int findMin(NodeTree root) {
        if (root == null)
            return -1;
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root.getData();
    }

    public int findMinRecursive(NodeTree root) {
        if (root == null)
            return -1;
        if (root.getLeft() != null) {
            return findMinRecursive(root.getLeft());
        }
        System.out.println("The minimum value is: " + root.getData());
        return root.getData();
    }

    public int findKthMax(NodeTree root, int k) {
        if (root == null)
            return -1;
        Integer data = findKthMax(root.getRight(), k);
        if (count != k) {
            count++;
            data = root.getData();
        }
        if (count == k) {
            System.out.println("K: " + data);
            return data;
        } else {
            return findKthMax(root.getLeft(), k);
        }
    }

    public boolean findAncestors(NodeTree root, int k) {
        if (root == null)
            return false;
        if (root.getData() == k)
            return true;
        if (findAncestors(root.getLeft(), k) || findAncestors(root.getRight(), k)) {
            System.out.print(root.getData() + ",");
            return true;
        }
        return false;
    }

}
