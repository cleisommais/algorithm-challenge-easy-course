package com.algorithms.tree;

import lombok.Getter;
import lombok.Setter;

public class BinarySearchTree {
    @Getter
    @Setter
    private NodeTree root;

    public boolean delete(Integer data, NodeTree current) {
        if (isEmpty()) {
            return false;
        }
        NodeTree parent = null;
        while (current != null && current.getData() != data) {
            parent = current;
            if (parent.getData() > data)
                current = current.getLeft();
            else
                current = current.getRight();
        }
        if (current == null)
            return false;
        else if (current.getLeft() == null && current.getRight() == null) {
            if (root.getData() == current.getData()) {
                setRoot(null);
                return true;
            } else if (current.getData() < parent.getData()) {
                parent.setLeft(null);
                return true;
            } else {
                parent.setRight(null);
                return true;
            }
        } else if (current.getRight() == null) {
            if (root.getData() == current.getData()) {
                setRoot(current.getLeft());
                return true;
            } else if (current.getData() < parent.getData()) {
                parent.setLeft(current.getLeft());
                return true;
            } else {
                parent.setRight(current.getLeft());
                return true;
            }
        } else if (current.getLeft() == null) {
            if (root.getData() == current.getData()) {
                setRoot(current.getRight());
                return true;
            } else if (current.getData() < parent.getData()) {
                parent.setLeft(current.getRight());
                return true;
            } else {
                parent.setRight(current.getRight());
                return true;
            }
        } else {
            NodeTree least = findLeast(current.getRight());
            Integer temp = least.getData();
            delete(temp, root);
            current.setData(temp);
            return true;
        }
    }

    private NodeTree findLeast(NodeTree current) {
        NodeTree temp = current;
        while (temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp;
    }

    public NodeTree search(Integer data) {
        if (isEmpty()) {
            return null;
        }
        NodeTree current = root;
        while (current != null) {
            if (data.equals(current.getData())) {
                return current;
            }
            if (current.getData() > data) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        System.out.println(data + ", not found!");
        return null;
    }

    public boolean add(Integer data) {
        if (isEmpty()) {
            root = new NodeTree(data);
            return true;
        }
        NodeTree current = root;
        while (current != null) {
            NodeTree left = current.getLeft();
            NodeTree right = current.getRight();
            if (current.getData() > data) {
                if (left == null) {
                    left = new NodeTree(data);
                    current.setLeft(left);
                    return true;
                }
                current = left;
            } else {
                if (right == null) {
                    right = new NodeTree(data);
                    current.setRight(right);
                    return true;
                }
                current = right;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void printTree(NodeTree node) {
        if (node == null)
            return;
        System.out.print(node.getData() + ",");
        printTree(node.getLeft());
        printTree(node.getRight());
    }
}
