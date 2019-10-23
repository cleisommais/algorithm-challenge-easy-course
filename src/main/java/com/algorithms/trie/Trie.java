package com.algorithms.trie;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Trie {
    @Setter
    @Getter
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String key) {
        if (isEmpty())
            return;
        key = key.toLowerCase();
        TrieNode current = root;
        int index = 0;
        for (int i = 0; i < key.length(); i++) {
            index = getIndex(key.charAt(i));
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.setEnd(true);
    }

    public boolean search(String key) {
        if (isEmpty())
            return false;
        key = key.toLowerCase();
        TrieNode current = root;
        int index = 0;
        for (int i = 0; i < key.length(); i++) {
            index = getIndex(key.charAt(i));
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEnd();
    }

    private boolean hasNoChildren(TrieNode current) {
        for (int i = 0; i < current.children.length; i++) {
            if (current.children[i] != null)
                return false;
        }
        return true;
    }

    private boolean delete(String key, TrieNode current, int length, int level) {
        boolean deleteMe = false;
        if (current == null) {
            System.out.println("Key does not exist!");
            return false;
        }
        if (level == length) {
            if (hasNoChildren(current)) {
                current = null;
                deleteMe = true;
            } else {
                current.setEnd(false);
                deleteMe = false;
            }
        } else {
            int index = getIndex(key.charAt(level));
            TrieNode child = current.children[index];
            boolean isChildDeleted = delete(key, child, length, level + 1);
            if (isChildDeleted) {
                current.children[index] = null;
                if (current.isEnd())
                    deleteMe = false;
                else if (!hasNoChildren(current))
                    deleteMe = false;
                else {
                    current = null;
                    deleteMe = true;
                }
            } else {
                deleteMe = false;
            }
        }
        return deleteMe;
    }

    public boolean delete(String key) {
        if (isEmpty() || key == null) {
            System.out.println("Null key or empty trie error!");
            return false;
        }
        return delete(key, root, key.length(), 0);
    }

    public int totalWords(TrieNode root) {
        int count = 0;
        if (root.isEnd())
            count++;
        int length = root.children.length;
        for (int i = 0; i < length; i++) {
            if (root.children[i] != null) {
                count = count + totalWords(root.children[i]);
            }
        }
        return count;
    }

    public ArrayList<String> findWords(TrieNode root) {
        if (root == null)
            return null;
        ArrayList<String> result = new ArrayList<>();
        char[] str = new char[26];
        getWords(root, result, 0, str);
        return result;
    }

    public void getWords(TrieNode root, ArrayList<String> result, int level, char[] str) {
        if (root == null)
            return;
        if (root.isEnd()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < level; i++) {
                stringBuilder.append(str[i]);
            }
            result.add(stringBuilder.toString());
        }
        int length = root.children.length;
        for (int i = 0; i < length; i++) {
            if (root.children[i] != null) {
                str[level] = (char) (i + 'a');
                getWords(root.children[i], result, level + 1, str);
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getIndex(char c) {
        return c - 'a';
    }
}
