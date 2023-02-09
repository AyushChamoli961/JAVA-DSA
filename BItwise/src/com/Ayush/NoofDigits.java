package com.Ayush;

public class NoofDigits {
    public static void main(String[] args) {
        int n=6256634;
        int base = 16;
        System.out.println(digit(n,base));
        System.out.println(pascal(5));
    }
    static int digit(int n , int base){
        return (int) (Math.log(n) / Math.log(base )+ 1);
    }
    static int pascal(int n){
        return 1 << (n-1);
    }
}
