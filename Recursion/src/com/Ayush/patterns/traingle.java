package com.Ayush.patterns;

public class traingle {
    public static void main(String[] args) {
        triangle(5,0);
        triangle2(5,0);
    }
    static void triangle2(int r , int c){
        if(r==0){
            return;
        }
        if(c<r){

            triangle2(r,c+1);
            System.out.printf(" * ");
        }
        else{

            triangle2(r-1,0);
            System.out.println();
        }

    }
    static void triangle(int r , int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.printf(" * ");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1,0);
        }

    }
}