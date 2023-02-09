package com.Ayush;

import java.util.Scanner;

public class Questiions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isarmstrong(n);
        System.out.println(ans);
    }


    static boolean isarmstrong(int a) {
        int sum = 0;
        int original = a;
        while (a > 0)
        {
            int rem = a % 10;
            a = a / 10;
            sum = sum + rem * rem * rem;
        }
        return sum==original;
    }

}
