package com.algorithms.utils;

public class TwoStacks<T> {
    private int maxSize;
    private int top;
    private int end;
    private T[] array;

    public TwoStacks(int maxSize) {
        this.maxSize = maxSize;
        this.array = (T[]) new Object[maxSize];
        this.top = -1;
        this.end = maxSize - 1;
    }

    public boolean isFull() {
        return top - end == 0;
    }

    public void push(T value) {
        if (isFull())
            return;
        array[++top] = value;
    }

    public T pop() {
        if (top == -1)
            return null;
        return array[top--];
    }

    public void push2(T value) {
        if (isFull())
            return;
        array[end--] = value;
    }

    public T pop2() {
        if (end == maxSize - 1)
            return null;
        return array[++end];
    }
}
