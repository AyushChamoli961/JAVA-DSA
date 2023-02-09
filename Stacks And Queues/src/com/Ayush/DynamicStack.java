package com.Ayush;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); //this will call CustomStack();
    }
    public DynamicStack(int size) {
        super(size); //this will call CustomStack(int size);
    }
    //Every thing will remain same just push method changes


    @Override
    public boolean push(int item) throws StackException {
        if(this.isFull()){
            //double array size
            int[] temp = new int[data.length*2];

            //copy  previous array elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point we know array is not full and we can push
        return super.push(item);
    }
}
