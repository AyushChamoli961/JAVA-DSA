package com.Ayush.Basics;

public class factorial {
    public static void main(String[] args) {
        int ans =1;
        int res = fact(5);
        System.out.println(res);

    }

    static int fact(int n) {
        if(n<=1) {
            return 1;
        }
        return n * fact(n-1);
    }
}
