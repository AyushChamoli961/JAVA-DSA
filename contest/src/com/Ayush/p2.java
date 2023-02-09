package com.Ayush;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test!=0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int sum = a + b;
            int x = 0;
            int rem = 0;
            int match = 0;
            while (sum > 0) {
                rem = sum % 10;
                if (rem == 0) {
                    match += 6;
                } else if (rem == 1) {
                    match += 2;
                } else if (rem == 2) {
                    match += 5;
                } else if (rem == 3) {
                    match += 5;
                } else if (rem == 4) {
                    match += 4;
                } else if (rem == 5) {
                    match += 5;
                } else if (rem == 6) {
                    match += 6;
                } else if (rem == 7) {
                    match += 3;
                } else if (rem == 8) {
                    match += 7;
                } else {
                    match += 6;
                }
                sum = sum / 10;
            }
            System.out.println(match);
            test--;
        }
    }
}

