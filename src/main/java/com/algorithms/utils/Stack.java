package com.algorithms.utils;

import lombok.Getter;
import lombok.Setter;

public class Stack<T> {
    private int maxSize;
    @Getter
    @Setter
    private int top;
    private T[] array;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.array = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    public T top() {
        if (isEmpty())
            return null;
        return array[top];
    }

    public void push(T value) {
        if (isFull())
            return;
        array[++top] = value;
    }

    public T pop() {
        if (isEmpty())
            return null;
        return array[top--];
    }
}
