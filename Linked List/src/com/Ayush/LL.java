package com.Ayush;

import com.Ayush.LLQUestions.LLCycle;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size ++;
    }

    public void display(){
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void InsertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            InsertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void Insert(int value , int index){
        if(index == 0){
            InsertFirst(value);
            return;
        }
        if(index == size){
            InsertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value , temp.next);

        temp.next = node;
        size++;
    }
    //Insert using recursion

    public void insertRec(int value , int index){
        head = insertRec(index,value,head);
    }
    private Node  insertRec(int index , int value, Node node){
        if(index == 0){
            Node temp = new Node(value , node);
            size++;
            return temp;
        }
        node.next = insertRec(--index,value,node.next);
        return node;
    }


    public int deletefirst(){
        int value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size --;
        return value;
    }

    public int deleteLast(){
        if(size<=1){
            return deletefirst();
        }
        int value = tail.value;
        tail = getNode(size-1);
        tail.next = null;
        size --;
        return value;
    }
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node node = getNode(index);
        int value = node.next.value;
        node.next = node.next.next;
        size --;
        return value;
    }

        public Node find(int value){
            Node node = head;
        while (node != null){
            if(node.value == value)
                return node;
            node =  node.next;
        }
        return null;
    }
    public Node getNode(int index){
        Node node = head;
        for (int i = 1; i < index ; i++) {
            node = node.next;
        }
        return node;
    }

    public void removeDuplicates(){
        Node node = head;
        if(node == null){
            System.out.println("No element presenet");
            return;
        }
        while(node!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
    }
    //merge two sorted
    public static LL merge(LL first , LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while(f!=null && s!=null) {
            if (f.value < s.value) {
                ans.InsertLast(f.value);
                f = f.next;
            } else {
                ans.InsertLast(s.value);
                s = s.next;
            }
        }
            while(f!=null){
                ans.InsertLast(f.value);
                f = f.next;
            }
            while (s!=null){
                ans.InsertLast(s.value);
                s = s.next;
            }

        return ans;
    }

    //bubble sort

    public void bubbleSort(){
        bubble(size-1,0);
    }

    private void bubble(int row  , int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = getNode(col);
            Node second = getNode(col + 1);
            if (first.value > second.value) {
                //swap
                if (first == head) {
                    head = second;
                    first.next  = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubble(row, col + 1);
        }
        else {
            bubble(row - 1, 0);
        }
    }

    // reverse a linked list using recursion
    private void reverse(Node node){
        if(node ==  tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    //Inplace reversal of linked list

    public void reverse(){
        if(head == null || head.next == null)
            return;
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null)
                next = next.next;
        }
        head = prev;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();

        list1.InsertLast(1);
        list1.InsertLast(2);
        list1.InsertLast(5);
        list1.InsertLast(9);

        list2.InsertLast(4);
        list2.InsertLast(5);
        list2.InsertLast(9);
        list2.InsertLast(11);

        LL ans = LL.merge(list1 , list2);
        ans.display();

        LL list = new LL();
        for (int i = 10; i > -1; i--) {
            list.InsertLast(i);
        }
        System.out.println();
        list.display();
        list.reverse();
        list.display();


    }
}

