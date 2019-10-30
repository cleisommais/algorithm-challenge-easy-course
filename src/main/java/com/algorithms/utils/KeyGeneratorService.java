package com.algorithms.utils;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.TimerTask;

public class KeyGeneratorService extends TimerTask {

    @Getter
    @Setter
    private static Set<String> set = new HashSet<>();

    @Override
    public void run() {
        try {
            int length = 10;
            boolean useLetters = true;
            boolean useNumbers = true;
            System.out.println(set.size());
            if (set.size() <= 200) {
                for (int i = 0; i < 60000; i++) {
                    set.add(RandomStringUtils.random(length, useLetters, useNumbers));
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
