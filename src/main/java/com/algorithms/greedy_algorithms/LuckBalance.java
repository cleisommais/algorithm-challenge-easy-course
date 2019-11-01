package com.algorithms.greedy_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
 */
public class LuckBalance {

    public int luckBalance(int k, int[][] contests) {
        if ((contests.length == 0 || contests[0].length == 0))
            throw new IllegalArgumentException("The Contests must be different of the zero length!");
        int totalLuckBalance = 0;
        List<Integer> listImportant = new ArrayList<>();
        List<Integer> listNotImportant = new ArrayList<>();
        for (int i = 0; i < contests.length; i++) {
            int luck = contests[i][0];
            int important = contests[i][1];
            if (important == 1) {
                listImportant.add(luck);
            } else {
                listNotImportant.add(luck);
            }
        }
        Collections.sort(listImportant);
        Collections.reverse(listImportant);
        for (int i = 0; i < listNotImportant.size(); i++) {
            totalLuckBalance += listNotImportant.get(i);
        }
        for (int i = 0; i < listImportant.size(); i++) {
            if (i < k)
                totalLuckBalance += listImportant.get(i);
            else
                totalLuckBalance -= listImportant.get(i);
        }
        return totalLuckBalance;
    }
}
