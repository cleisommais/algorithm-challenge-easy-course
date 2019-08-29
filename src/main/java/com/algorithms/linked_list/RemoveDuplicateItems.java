package com.algorithms.linked_list;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;


public class RemoveDuplicateItems {
    /**
     * @param linkedList
     * @return
     */
    public LinkedList<Integer> removeDuplicates(LinkedList<Integer> linkedList) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : linkedList) {
            map.put(i, i);
        }
        linkedList.clear();
        linkedList.addAll(map.values());
        return linkedList;
    }
}
