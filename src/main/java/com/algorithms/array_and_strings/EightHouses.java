package com.algorithms.array_and_strings;

import java.util.ArrayList;
import java.util.List;

public class EightHouses {
    public List<Integer> cellCompete(int[] states, int days) {
        List<Integer> response = new ArrayList<>();
        if (states.length != 8 || days < 1) {
            for (int i = 0; i < states.length; i++) {
                response.add(states[i]);
            }
            return response;
        }
        int index, previousValue, nextValue;
        for (int i = 0; i < days; i++) {
            index = 0;
            previousValue = 0;
            nextValue = 0;
            while (index < states.length) {
                if (index < states.length - 1) {
                    nextValue = states[index + 1];
                } else if (index == states.length - 1) {
                    nextValue = 0;
                }
                if (nextValue == previousValue) {
                    previousValue = states[index];
                    states[index] = 0;
                } else {
                    previousValue = states[index];
                    states[index] = 1;
                }
                index++;
            }
        }
        for (int i = 0; i < states.length; i++) {
            response.add(states[i]);
        }
        return response;
    }
}
