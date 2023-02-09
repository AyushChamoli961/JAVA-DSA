package com.Ayush.Basics;

public class ReverseAnumber {
    public static void main(String[] args) {
        int ans = Rev2(98767);
        System.out.println(ans);

    }
    static int sum=0;
    static void Rev1(int n){


        if( n==0){
            return;
        }
        int rem = n%10;
        sum*=10+rem;
        Rev1(n/10 );
    }
    static int Rev2(int n ){
        int digits =(int)(Math.log10(n))+1;
        return rev(n,digits);

    }

     static int rev(int n, int digits) {
         if(n%10==n){
             return n;
         }
         int rem=n%10;
         return rem*(int)Math.pow(10,digits-1) + rev(n/10,digits-1);
     }
}
