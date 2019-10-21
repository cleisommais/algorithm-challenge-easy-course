package com.algorithms.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

    private Queue<Integer> queue;

    @Before
    public void setUp() throws Exception {
        queue = new Queue<>(10);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void enqueue_dequeue() {
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
        Assert.assertEquals(10, queue.getCurrentSize());
        Assert.assertEquals(new Integer(1), queue.dequeue());
        Assert.assertEquals(new Integer(2), queue.dequeue());
        Assert.assertEquals(new Integer(3), queue.dequeue());
        Assert.assertEquals(new Integer(4), queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        Assert.assertEquals(10, queue.getCurrentSize());
        Assert.assertEquals(new Integer(5), queue.dequeue());
        Assert.assertEquals(new Integer(6), queue.dequeue());
        Assert.assertEquals(new Integer(7), queue.dequeue());
        Assert.assertEquals(new Integer(8), queue.dequeue());
        Assert.assertEquals(new Integer(9), queue.top());
    }
}
