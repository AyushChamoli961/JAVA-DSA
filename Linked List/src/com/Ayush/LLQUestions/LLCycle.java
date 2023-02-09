package com.Ayush.LLQUestions;

//https://leetcode.com/problems/linked-list-cycle/#:~:text=There%20is%20a%20cycle%20in,next%20pointer%20is%20connected%20to.

 class Node {
    int val;
    Node next;

     public Node() {
     }

     Node(int x) {
        val = x;
        next = null;
    }
}

public class LLCycle {
    public static boolean hasCycle(Node head) {
        Node f = head;
        Node s = head;

        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
            if(f==s)//fast ans slow pointer will meet at this point.
            {
                return true;
            }
        }
        return false;
    }
    public static int lengthOfCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
    public Node detectCycle(Node head) {

        Node fast = head;
        Node slow = head;

        int length = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                //calculate length
                length = lengthOfCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        Node f = head;
        Node s = head;

        //move s length times ahead
        while (length > 0) {
            s = s.next;
            length--;
        }
        //now both pointers are at eqaul distance from starting node of cycle
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

//    https://leetcode.com/problems/happy-number/

    public static boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            slow = findSqaure(slow);
            fast = findSqaure(findSqaure(fast));
        }while(fast!=slow);
        if(slow== 1){
            return true;
        }
        return false;
    }
    private static int findSqaure(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem;
            n = n / 10;
        }
        return ans;
    }
    public Node middleNode(Node head) {
        Node temp = head;
        Node ans = head;
        int length  = 0;
        if(head == null){
            return null;
        }
        while(temp.next!=null){
            temp = temp.next;
            length++;
        }
        if(length%2==0){
            length = length/2;
        }
        else{
            length = length/2+1;
        }
        while(length>0){
            ans = ans.next;
            length--;
        }
        return ans;
    }
    public Node middleNodeOneGo(Node head)
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
    public static void main(String[] args) {
//        ListNode node = new ListNode(5);
//        ListNode head  =node;
//        for (int i = 0; i < 5; i++) {
//            node.next = new ListNode(i);
//        }
//        head.next.next = node;
//        System.out.println(lengthOfCycle(head));
//        System.out.println(hasCycle(head));
        boolean ans = isHappy(7);
        System.out.println(ans);

    }


}
