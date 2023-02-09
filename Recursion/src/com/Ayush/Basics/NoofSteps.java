package com.Ayush.Basics;

public class NoofSteps {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int num,int c) {
        return helper(num,0);
    }
    private int helper(int n, int c){

        if(n==0){
            return c;
        }
        if(n%2==0){
            return numberOfSteps(n/2,c+1);
        }
        return numberOfSteps(n-1,c+1);



    }
}
