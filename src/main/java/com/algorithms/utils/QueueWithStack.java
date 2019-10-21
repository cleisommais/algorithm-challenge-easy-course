package com.algorithms.utils;

import lombok.Getter;
import lombok.Setter;

public class QueueWithStack<T> {
    @Getter
    @Setter
    private int maxSize;
    @Getter
    private Stack<T> mainStack;
    @Getter
    private Stack<T> auxStack;
    @Getter
    @Setter
    private int currentSize;

    public QueueWithStack(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.mainStack = new Stack<>(maxSize);
        this.auxStack = new Stack<>(maxSize);
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    private boolean isFull() {
        return currentSize == maxSize;
    }

    public void enqueue(T value) {
        if (isFull())
            return;
        mainStack.push(value);
        currentSize++;
    }

    public T dequeue() {
        if (isEmpty())
            return null;
        T result = null;
        if (!mainStack.isEmpty()) {
            while (!mainStack.isEmpty()) {
                auxStack.push(mainStack.pop());
            }
            result = auxStack.pop();
            while (!auxStack.isEmpty()) {
                mainStack.push(auxStack.pop());
            }
        }
        currentSize--;
        return result;
    }
}
