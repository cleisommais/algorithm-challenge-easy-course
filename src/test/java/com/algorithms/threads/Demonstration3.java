package com.algorithms.threads;

import java.util.Random;

class Demonstration3 {
    public static void main(String[] args) throws InterruptedException {
        RaceCondition2.runTest();
    }
}

class RaceCondition2 {
    int randInt;
    Random random = new Random(System.currentTimeMillis());

    public static void runTest() throws InterruptedException {
        final RaceCondition2 rc = new RaceCondition2();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rc.printer();
            }
        });
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                rc.modifier();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    void printer() {
        int i = 1000000;
        while (i != 0) {
            synchronized (this) {
                if (randInt % 5 == 0) {
                    if (randInt % 5 != 0)
                        System.out.println(randInt);
                }
            }
            i--;
        }
    }

    void modifier() {
        int i = 1000000;
        while (i != 0) {
            synchronized (this) {
                randInt = random.nextInt(1000);
                i--;
            }
        }
    }
}