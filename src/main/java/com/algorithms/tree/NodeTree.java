package com.algorithms.tree;

import lombok.Getter;
import lombok.Setter;

public class NodeTree {
    @Getter
    @Setter
    private Integer data;
    @Getter
    @Setter
    private NodeTree left;
    @Getter
    @Setter
    private NodeTree right;

    public NodeTree(Integer data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
