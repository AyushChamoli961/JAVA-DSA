package com.Ayush;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public void insert(int item) throws Exception {
        if(this.isFull()){
            //double array size
            int[] temp = new int[data.length*2];

            //copy  previous array elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        super.insert(item);
    }
}
