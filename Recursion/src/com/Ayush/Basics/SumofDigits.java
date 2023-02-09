package com.Ayush.Basics;

public class SumofDigits {
    public static void main(String[] args) {
        int ans=sum(1342);
        System.out.println(ans);

    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int x= n%10;
        int ans= n%10+ 10*sum(n/10);
        return ans;
    }
}
