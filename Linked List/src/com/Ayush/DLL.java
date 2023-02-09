package com.Ayush;

public class DLL {

    Node head;
    int size;
    public DLL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null)
            head.prev = node;
        head =  node;
        size ++ ;
    }
    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null)
            insertFirst(value);
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            node.prev = last;
            node.next = null;
            last.next = node;
        }
    }

    public void insertAfter(int after , int value){
        Node node = new Node(value);
        Node temp = get(after);
        if(temp == null){
            System.out.println("Vallue does not exist");
            return;
        }

        node.prev = temp;
        node.next = temp.next;
        if(temp.next == null){
            temp.next = node;
            return;
        }
        temp.next.prev = node;
        temp.next = node;


    }

    public Node get (int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        Node tail = null;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.value + "->");
            tail = temp;
            temp = temp.next;
        }
        System.out.println("END");

        while(tail!=null){
            System.out.print(tail.value + "->");
            tail = tail.prev;
        }
        System.out.println("END");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
