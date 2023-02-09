package com.Ayush;

public class SetBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(99));
        System.out.println(setbit2(99));
    }

    static int setbit(int n) {

        int x = 1;
        int count = 0;

        while (n > 0) {
            if ((n & x) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    static int setbit2(int n){
        int count =0;

        while(n>0){
            count++;
            n-=(n & -n);
        }
        return count;
    }
}


