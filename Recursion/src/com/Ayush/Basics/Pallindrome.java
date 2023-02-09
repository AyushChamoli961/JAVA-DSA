package com.Ayush.Basics;

public class Pallindrome {
    public static void main(String[] args) {

        System.out.println(pallin(-1234321));

    }
    static int Rev(int n ){
        int digits =(int)(Math.log10(n))+1;
        return helper(n,digits);

    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
    static boolean pallin(int n){
        return n==Rev(n);
    }

}
