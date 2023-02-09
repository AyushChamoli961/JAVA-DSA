package com.Ayush.Basics;

public class DigitsProduct {
    public static void main(String[] args) {
        int ans=sum(55);
        System.out.println(ans);

    }
    static int sum(int n){
        if(n==0){
            return 1;
        }
        int x= n%10;
        n=n/10;
        int ans= x * sum(n);
        return ans;
    }
}
