package com.Ayush;

public class CLL {
    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value){
        Node node = head;
        if(node == null)
            return;
        if(node.value == value){
            head = head.next;
            tail.next= head;
            return;
        }
        while(node!=null){
            if(node.next.value == value){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        System.out.println("Value not present");
    }


    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + "->");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD");
        }
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
