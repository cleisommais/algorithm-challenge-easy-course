package com.algorithm.complexity;

import java.util.*;
import java.io.*;

class test {
    public static String LongestWord(String sen) {
        String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
        Arrays.sort(words, Comparator.comparing(String::length));
        return words[words.length - 1];
    }

    public static void main (String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        System.out.print(LongestWord("Argument ddddddddddddd goes here"));
    }

}