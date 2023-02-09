package com.Ayush;

public class CustomQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full , no more item can be inserted");
        }
        data[end++] = item;
        System.out.println("Item inserted");
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw  new Exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<--");
        }
        System.out.print("END");
        System.out.println();
    }
    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end ==  0;
    }
}

