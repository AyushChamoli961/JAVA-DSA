package com.Ayush;


import java.util.Scanner;

public class Pattern{
    public static void main(String[] args) {
        // write your code here
        Pattern1(5);
        System.out.println();
        Pattern2(5);
        System.out.println();
        Pattern3(5);
        System.out.println();
        Pattern4(5);
        System.out.println();
        Pattern5(5);
        System.out.println();
        AlternatePattern5(5);
        System.out.println();
        Pattern28(5);
        System.out.println();
        Pattern30(5);
        System.out.println();
        Pattern18(5);
    }
    static void Pattern18(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 0; j--) {
                System.out.print("*");

            }
            int spaces = 2 * i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");


                for (int j = n - i; j > 0; j--) {
                    System.out.print("*");

                }
                for (int j = n + 1; j < n; j++) {
                    System.out.print("*");

                }

                for ( s = 2 * i; s > 0; s--) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 1; j<n; j++) {
                System.out.print("*");

            }
            int spaces = 2 * i;
            for (int s = spaces; s < 2; s++) {
                System.out.print(" ");

            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");

            }
            for (int j = n + 1; j < n; j++) {
                System.out.print("*");

            }

            for (int s = 2 * i; s > 0; s--) {
                System.out.print(" ");
            }
            System.out.println();


        }


    }


    static void Pattern30(int n) {
        for (int i = 1; i <= n; i++) {

            for (int spaces = 0; spaces < n - i; spaces++) {
                System.out.print(" ");

            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();


        }
    }

    static void Pattern1(int n){
        for (int row = 1; row < n; row++) {
            for (int col= 1; col <= row; col++) {

                System.out.print("* ");

            }
            //new line should be printed after every row is finished.
            System.out.println();

        }
    }
    static void Pattern2(int n){
        for (int row = 0; row <n; row++) {
            for (int col = 0; col <n; col++){
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void Pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void Pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i  ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
    static void Pattern5(int n){
        for (int row = 1; row < n; row++) {
            for (int col= 1; col <= row; col++) {

                System.out.print("* ");

            }
            //new line should be printed after every row is finished.
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void AlternatePattern5(int n){
        for (int i = 0; i < 2 * n ; i++) {
            int totalcol= i > n ? 2*n -i : i;
            for (int j = 0; j < totalcol; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void Pattern28(int n){

        for (int i = 0; i < 2*n; i++) {
            int totalcol= i > n ? 2*n -i : i;
            int s = n-totalcol;
            for (int sapces = 0; sapces < s ; sapces++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalcol; j++) {
                System.out.print("* " );
                
            }
            System.out.println();


        }
    }
}
