package com.algorithms.linked_list;

import java.util.LinkedList;

public class SumLists {
    public LinkedList<Integer> sumDigits(LinkedList<Integer> list01, LinkedList<Integer> list02) {
        LinkedList<Integer> result = new LinkedList<>();
        String digits = String.valueOf(concateSumLinkedList(list01, list02));
        System.out.println(digits);
        for (int i = 0; i < digits.length(); i++) {
            result.add(Integer.parseInt(String.valueOf(digits.charAt(i))));
        }
        return reverseLinkedList(result);
    }

    private Integer concateSumLinkedList(LinkedList<Integer> list01, LinkedList<Integer> list02) {
        StringBuilder concatList01 = new StringBuilder();
        StringBuilder concatList02 = new StringBuilder();
        for (Integer i : reverseLinkedList(list01)) {
            concatList01.append(i);
        }
        for (Integer i : reverseLinkedList(list02)) {
            concatList02.append(i);
        }
        System.out.println(concatList01);
        System.out.println(concatList02);
        Integer sum = new Integer(concatList01.toString()) + new Integer(concatList02.toString());
        return sum;
    }

    private LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }
}
