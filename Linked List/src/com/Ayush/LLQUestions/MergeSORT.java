package com.Ayush.LLQUestions;

public class MergeSORT {
    public Node sortList(Node head) {
        if(head == null  || head.next == null){
            return head;
        }
        Node mid =  getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);
        return merge(left,right);
    }

    public Node getMid(Node head)
    {
        Node f = head;
        Node s = head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }

    public Node merge(Node list1, Node list2) {
        Node dummyhead = new Node();
        Node tail = dummyhead;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1!=null)?list1:list2;
        return dummyhead.next;
    }
}


