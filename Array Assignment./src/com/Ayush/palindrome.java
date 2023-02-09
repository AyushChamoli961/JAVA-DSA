package com.Ayush;

public class palindrome {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(palindrome(x));
        if (palindrome(x) == x) {
            System.out.println("true");
            ;
        } else {
            System.out.println("false");
        }
    }
   static  int palindrome(int x){
        int sum=0;
        int y=0;
        while(Math.abs(x)>0){
            y=x%10;
            sum=(sum*10)+y;
            x=x/10;

        }
        return sum;

    }
    }

