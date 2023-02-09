package com.Ayush.Questions;

import java.util.Arrays;

public class ThreeInOne {
    private int noOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int Stacksize) {
        stackCapacity = Stacksize;
        values = new int[stackCapacity * noOfStacks];
        sizes = new int[noOfStacks];
    }

    public boolean isFull(int stackNum) {
        if (sizes[stackNum] == stackCapacity) {
            return true;
        }
        return false;
    }

    public boolean isEmpty(int stackNum) {
        if (sizes[stackNum] == 0) {
            return true;
        }
        return false;
    }

    public int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    public int peek(int stackNUm) throws Exception {
        if (isEmpty(stackNUm)) {
            throw new Exception("Stack is empty");
        }
        return values[indexOfTop(stackNUm)];
    }

    public void push(int item, int stackNum) throws Exception {
        if (isFull(stackNum)) {
            throw new Exception("Stack is full");
        }
        sizes[stackNum] += 1;
        values[indexOfTop(stackNum)] = item;
    }

    public int pop(int stackNum) throws Exception {
        if (isEmpty(stackNum)) {
            throw new Exception("Stack is empty");
        }
        int popped = values[indexOfTop(stackNum)];
        values[indexOfTop(stackNum)] = 0;
        sizes[stackNum]--;
        return popped;
    }
}
