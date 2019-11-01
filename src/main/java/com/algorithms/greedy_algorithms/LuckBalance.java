package com.algorithms.greedy_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
 */
public class LuckBalance {

    public int luckBalance(int k, int[][] contests) {
        if (k == 0 || (contests.length == 0 || contests[0].length == 0))
            throw new IllegalArgumentException("The arguments k and contests must be different of the zero length!");
        int totalLuckBalance = 0;
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < contests.length; i++) {
            int luck = contests[i][0];
            int important = contests[i][1];
            if (important == 1 && luck == 1) {
                tempList.add(luck);
            } else {
                totalLuckBalance += luck;
            }
        }
        Collections.sort(tempList);
        for (int i = 0; i < tempList.size(); i++) {
            if (i < k)
                totalLuckBalance -= tempList.get(i);
            else
                totalLuckBalance += tempList.get(i);
        }
        return totalLuckBalance;
    }
}
