package com.Ayush;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        int count =0;
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        System.out.println("enter no to search");
        int b= in.nextInt();
        while (a>9)
        {
            if (a%10==b);
            {
               count=+1;

            }
            a=a/10;


        }
        System.out.println(count);

    }
}
