package com.Ayush.LLQUestions;

import com.sun.source.tree.BreakTree;

public class Reverse2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left ==  right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for (int i=0; i < left-1 && current!=null ; i++) {
            prev =  current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        // reverse the list

        ListNode next = current.next;
        for (int i = 0;  current != null && i<right-left+1 ; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null)
                next = next.next;
        }
        if(last!=null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null || head.next == null)
            return head;
        ListNode current = head;
        ListNode prev = null;
        while(true){

            ListNode last = prev;
            ListNode newEnd = current;
            // reverse the list
            ListNode newPresent = current;
            for(int i = 0; newPresent != null && i < k - 1; i++){
                newPresent = newPresent.next;
            }

            if(newPresent == null){
                break;
            }

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {

                current.next = prev;
                prev = current;
                current = next;
                if (next != null)
                    next = next.next;
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            if(current == null)
                break;
            prev = newEnd;
        }

        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head == null || head.next == null)
            return head;
        ListNode last = head;
        int length = 1;
            while (last.next != null) {
                last = last.next;
                length ++;
            }
            last.next = head;
            int rotations = k% length;
            int skip = length - rotations;
            
            ListNode newEnd = head;
        for (int i = 0; i < skip; i++) {
            newEnd = newEnd.next;
        }
        head = newEnd.next;
        newEnd.next = null;

        return head;
        }
}
