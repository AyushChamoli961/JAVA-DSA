package com.Ayush;

import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        int r;
        r = fun(200);
        System.out.println(r);


    }
    static  int fun(int n)
    {
        if(n>200)
            return n-10;
        return fun(fun(n+11));
    }
}
