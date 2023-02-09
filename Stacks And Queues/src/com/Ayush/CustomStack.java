package com.Ayush;

public class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack Full , item can't be added");
        }
        System.out.println(item);
        data[++ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack empty , item can't be popped");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack empty , no peek found");
        }
        return data[ptr];
    }
}
