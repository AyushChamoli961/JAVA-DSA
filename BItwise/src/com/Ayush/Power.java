package com.Ayush;

public class Power {
    public static void main(String[] args) {
        int power = 6;
        int base = 3;

        int ans = 1;

        while(power > 0){
            if((power & 1) == 1){
                ans*=base;
            }
            base*=base;
            power = power>>1;
        }
        System.out.println(ans);
    }
}
