package com.Ayush;

import java.util.*;

public class InBuiltExaples {

    public static void main(String[] args) throws Exception {
//        Stack  <Integer> stack =  new Stack<>();
//        stack.push(7);
//        stack.push(5);
//        stack.push(9);
//        stack.push(12);
//        stack.push(54);
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(2);
//        queue.add(1);
//        queue.add(27);
//        queue.add(221);
//
//
////        LIFO or FILO
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        System.out.println();
////        FIFO or LILO
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//
//        Deque deque = new ArrayDeque<>();
        DynamicStack data = new DynamicStack(5);
        data.push(5);
        data.push(6);
        data.push(11);
        data.push(9);
        data.push(7);
        data.push(7);
        data.push(7);



    }
}
