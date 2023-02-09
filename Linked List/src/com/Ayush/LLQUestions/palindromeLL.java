package com.Ayush.LLQUestions;

public class palindromeLL {
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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null)
                next = next.next;
        }
        return prev;
    }
    public ListNode middleNode(ListNode head)
    {
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);

        while (head!=null && secondHead!=null){
            if(head.val!= secondHead.val)
                return false;
        }
        return true;
    }

}
