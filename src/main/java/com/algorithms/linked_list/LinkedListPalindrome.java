package com.algorithms.linked_list;

import java.util.LinkedList;

public class LinkedListPalindrome {
    /**
     * @param list
     * @return
     */
    public boolean isPalindrome(LinkedList<Integer> list) {
        LinkedList<Integer> temp = list;
        return temp.equals(reverseLinkedList(list));
    }

    /**
     * @param list
     * @return
     */
    private LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }
}
