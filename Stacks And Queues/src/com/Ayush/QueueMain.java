package com.Ayush;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(11);
        queue.insert(9);
        queue.insert(99);
        queue.insert(91);
        queue.insert(5);
        queue.insert(6);
        queue.insert(11);
        queue.insert(9);
        queue.insert(99);
        queue.insert(91);
        queue.display();

    }

}
