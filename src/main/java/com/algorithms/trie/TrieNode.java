package com.algorithms.trie;

import lombok.Getter;
import lombok.Setter;

public class TrieNode {
    public TrieNode[] children;

    @Getter
    @Setter
    private boolean isEnd;

    public TrieNode() {
        this.isEnd = false;
        //Total # of English Alphabets = 26
        this.children = new TrieNode[26];
    }
}
