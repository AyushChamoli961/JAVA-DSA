package com.Ayush.Basics;

public class Fibonacci {
    public static void main(String[] args) {
        int ans =  fibo(6);
        System.out.println(ans);
        int temp=1;
        for (int i = 1; i<=5 ; i++) {
            for(int j=temp;j<=i+1;j++) {
                System.out.print(fibo(j++));
            }
            temp++;
            System.out.println();
        }
    }
    static long fiboFormula(int n){
        return (long)((Math.pow(1+Math.sqrt(5)/2,n)-Math.pow(1-Math.sqrt(5)/2,n))/Math.sqrt(5));
    }
    static int fibo(int n){
        if (n<=2 && n>=0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
