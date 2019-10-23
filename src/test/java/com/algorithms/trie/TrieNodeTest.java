package com.algorithms.trie;

import org.junit.Before;
import org.junit.Test;

public class TrieNodeTest {
    Trie trie;

    @Before
    public void setUp() throws Exception {
        trie = new Trie();
    }

    @Test
    public void testTrieNode() {
        String[] keys = {"the", "a", "there", "answer", "any",
                "by", "bye", "their", "abc"};
        String[] output = {"not present in trie", "present in trie"};
        for (String key : keys) {
            trie.insert(key);
        }
        if (trie.search("there"))
            System.out.println("Key there is " + output[1]);
        else
            System.out.println("Key there is " + output[0]);
        System.out.println(trie.findWords(trie.getRoot()));
    }
}
