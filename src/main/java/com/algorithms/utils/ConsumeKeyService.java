package com.algorithms.utils;

import java.util.Iterator;
import java.util.TimerTask;

public class ConsumeKeyService extends TimerTask {
    @Override
    public void run() {
        Iterator iterator = KeyGeneratorService.getSet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            System.out.println("Consuming the key: " + iterator.next());
            KeyGeneratorService.getSet().remove(iterator.next());
            if (count > 1000)
                break;
            count++;
        }
    }
}
