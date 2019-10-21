package com.algorithms.queue_stack;

import com.algorithms.utils.Queue;
import com.algorithms.utils.QueueWithStack;
import com.algorithms.utils.Stack;
import com.algorithms.utils.TwoStacks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class QueueStackChallengesTest {

    private Stack<Integer> stack;
    private QueueWithStack<Integer> queueWithStack;
    private TwoStacks<Integer> twoStacks;
    private Queue<Integer> queue;

    private QueueStackChallenges queueStackChallenges;


    @Before
    public void setUp() throws Exception {
        queueStackChallenges = new QueueStackChallenges();
    }

    @Test
    public void queueUsingStackTest() {
        queueWithStack = new QueueWithStack<>(10);
        queueWithStack.enqueue(1);
        queueWithStack.enqueue(2);
        queueWithStack.enqueue(3);
        queueWithStack.enqueue(4);
        queueWithStack.enqueue(5);
        Assert.assertEquals(5, queueWithStack.getCurrentSize());
        Assert.assertEquals(new Integer(1), queueWithStack.dequeue());
        Assert.assertEquals(new Integer(2), queueWithStack.dequeue());
        Assert.assertEquals(new Integer(3), queueWithStack.dequeue());
    }

    @Test
    public void findBinChallenge() {
        String[] array = queueStackChallenges.findBinChallenge(5);
        Assert.assertEquals(Arrays.toString(new String[]{"1", "10", "11", "100", "101"}), Arrays.toString(array));
    }

    @Test
    public void twoStacksTest() {
        twoStacks = new TwoStacks<>(10);
        twoStacks.push(1);
        twoStacks.push(2);
        twoStacks.push2(10);
        twoStacks.push(3);
        twoStacks.push(4);
        twoStacks.push(5);
        twoStacks.push2(9);
        twoStacks.push2(8);
        twoStacks.push2(7);
        twoStacks.push2(6);
        Assert.assertEquals(true, twoStacks.isFull());
        Assert.assertEquals(new Integer((5)), twoStacks.pop());
        twoStacks.pop();
        twoStacks.pop();
        twoStacks.pop();
        twoStacks.pop();
        twoStacks.pop();
        Assert.assertEquals(new Integer((6)), twoStacks.pop2());
        twoStacks.pop2();
        twoStacks.pop2();
        twoStacks.pop2();
        twoStacks.pop2();
        twoStacks.pop2();
        twoStacks.push(20);
        twoStacks.push2(30);
        Assert.assertEquals(new Integer((20)), twoStacks.pop());
        Assert.assertEquals(new Integer((30)), twoStacks.pop2());
    }

    @Test
    public void testReverseKQueue() {
        queueStackChallenges = new QueueStackChallenges();
        queue = new Queue<>(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queueStackChallenges.reverseKQueue(queue, 5);
        Assert.assertEquals(Arrays.toString(new int[]{5, 4, 3, 2, 1, 6, 7, 8, 9, 10}), Arrays.toString(queue.getArray()));
    }

}
