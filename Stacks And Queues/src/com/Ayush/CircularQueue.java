package com.Ayush;

public class CircularQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full , no more item can be inserted");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        System.out.println("Item inserted");
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw  new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public void display(){
        int i = front;
        do{
            System.out.print(data[i++] + "-->");
            i%= data.length;;
        }while (i!=end);

        System.out.print("END");
        System.out.println();
    }
    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size ==  0;
    }
}
