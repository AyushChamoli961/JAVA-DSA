package com.Ayush.Questions;

import java.util.Stack;

public class QueuefromStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueuefromStack() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int x){
        first.push(x);
    }
    public int pop(){
        while(!first.isEmpty()){
            second.add(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.add(second.pop());
        }
        return removed;
    }
    public int peek(){
        while(!first.isEmpty()){
            second.add(first.pop());
        }
        int peek = second.peek();
        while(!second.isEmpty()){
            first.add(second.pop());
        }
        return peek;
    }
    public boolean empty(){
        return first.isEmpty();
    }

}
