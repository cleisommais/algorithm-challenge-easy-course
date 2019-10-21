package com.algorithms.queue_stack;

import com.algorithms.utils.Queue;
import com.algorithms.utils.Stack;
import com.algorithms.utils.TwoStacks;

public class QueueStackChallenges {

    private Stack<Integer> stack;
    private Queue<Integer> queue;
    private TwoStacks<Integer> twoStacks;

    public String[] findBinChallenge(int number) {
        String[] result = new String[number];
        queue = new Queue<>(number);
        queue.enqueue(1);
        for (int i = 0; i < number; i++) {
            result[i] = String.valueOf(queue.dequeue());
            String first = result[i] + "0";
            queue.enqueue(Integer.valueOf(first));
            String second = result[i] + "1";
            queue.enqueue(Integer.valueOf(second));
        }
        return result; //For number = 3 , result = {"1","10","11"};
    }

    public void reverseKQueue(Queue<Integer> queue, int k) {
        stack = new Stack<>(5);
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        for (int i = 0; i < k; i++) {
            queue.enqueue(stack.pop());
        }
    }
}
