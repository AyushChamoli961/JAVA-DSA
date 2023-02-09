package com.Ayush;

public class Basic {
    public static void main(String[] args) {
        LL list = new LL();
        LL list2 = new LL();
//        CLL list =  new CLL();
        list.InsertFirst(9);
        list.InsertFirst(4);
        list.InsertFirst(2);
        list.InsertFirst(2);
        list.InsertFirst(1);

        list2.InsertFirst(11);
        list2.InsertFirst(10);
        list2.InsertFirst(9);
        list2.InsertFirst(8);
        list2.InsertFirst(4);

//        list.display();
//        list.insertRec(99 , 5);
//        list.removeDuplicates();
//        System.out.println();
        LL ans = LL.merge(list , list2);
//        list.InsertLast(99);
//        list.display();
//        list.insert(69 ,2);
//        System.out.println(list.deletefirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.find(45));
//        System.out.println(list.delete(3));
        ans.display();
    }

}
