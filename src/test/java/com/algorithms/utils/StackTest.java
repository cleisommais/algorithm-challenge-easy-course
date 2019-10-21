package com.algorithms.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack<>(10);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void push_pop() {
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(11);
        Assert.assertEquals(5, stack.getTop());
        Assert.assertEquals(new Integer(11), stack.pop());
        Assert.assertEquals(new Integer(9), stack.pop());
        Assert.assertEquals(new Integer(7), stack.pop());
        stack.push(7);
        stack.push(9);
        stack.push(11);
        Assert.assertEquals(5, stack.getTop());
        Assert.assertEquals(new Integer(11), stack.pop());
        Assert.assertEquals(new Integer(9), stack.pop());
        Assert.assertEquals(new Integer(7), stack.pop());
    }

}
