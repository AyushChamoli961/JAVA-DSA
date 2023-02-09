package com.Ayush;

public class NewtonSqrt {
    public static void main(String[] args) {
        double ans = sqrt(25);
        System.out.println(ans);
    }
    static double sqrt(int n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x + n/x);
            if(Math.abs(root-x) < 0.01){
                break;
            }
            x=root;
        }
        return root;
    }
}
