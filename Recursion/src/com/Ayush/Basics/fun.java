package com.Ayush.Basics;

public class fun {
    public static void main(String[] args) {
       printrev(5);

    }
    //concept
    static void concept(int n){
        if(n==0){

            return;
        }
        System.out.println(n);
        concept(--n);
        //here if we use n-- first value will be passed and then -- will happen
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);

    }

    static void printrev(int n){
        if(n==0){
            return;
        }
        printrev(n-1);
        System.out.println(n);


    }

    static void printboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printboth(n-1);
        System.out.println(n);

    }
}
