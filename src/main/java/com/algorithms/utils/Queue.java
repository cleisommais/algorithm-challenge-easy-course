package com.algorithms.utils;

import lombok.Getter;
import lombok.Setter;

public class Queue<T> {
    @Getter
    @Setter
    private int maxSize;
    @Getter
    private T[] array;
    private int front;
    private int back;
    @Getter
    @Setter
    private int currentSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.array = (T[]) new Object[maxSize];
        this.front = 0;
        this.back = -1;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public T top() {
        return array[front];
    }

    public void enqueue(T value) {
        if (isFull())
            return;
        back = (back + 1) % maxSize;
        array[back] = value;
        currentSize++;
    }

    public T dequeue() {
        if (isEmpty())
            return null;
        T tempArray = array[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return tempArray;
    }
}
