package com.Ayush.Basics;

public class CountZeros {
    public static void main(String[] args) {
        int ans=count(100);
        System.out.println(ans);

    }

    static int count(int n) {

        return helper(n, 0);
    }
    //special pattern how to pass a value to above calls.

    private static int helper(int n, int c) {
        if (n == 0) {

            return c;
        }
        if (n % 10 == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }

}

