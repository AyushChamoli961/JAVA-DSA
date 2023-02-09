package com.Ayush.Basics;

public class fact{
    public static void main(String[] args) {
        int ans=factorial(5);
        System.out.println(ans);

    }
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        int a= n *factorial(n-1);
        return a;
    }
}
