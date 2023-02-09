package com.Ayush;

public class GCD_LCM {
    public static void main(String[] args) {
        int x = 72;
        int y = 81;

        System.out.println(lcm(x,y));

    }
    static int gcd(int x, int y){
        if(x==0)
            return y;
        return gcd(y%x,x);
    }
    static int lcm(int x , int y)
    {
        int ans =gcd(x,y);
        ans = x*y/ans;
        return ans;
    }
}
