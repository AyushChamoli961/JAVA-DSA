package com.Ayush;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a=0;
        int b=1;
        int count =2;
        int c = in.nextInt();
        while(count<=c)
        {
            int temp=b;
            b=a+b;
            a=temp;
            count++;

        }
        System.out.println(b);

    }
}
