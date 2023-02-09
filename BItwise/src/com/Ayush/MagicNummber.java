package com.Ayush;

public class MagicNummber {
    public static void main(String[] args) {
        System.out.println(magic2(3));
    }
    static int magic(int n){
        int result = 0;
        for(int i=0;i<8;i++){
            int x = 1 << i;
            if((n&x)>0){
                result+=Math.pow(5,i+1);
            }
        }
        return result;
    }
    static int magic2(int n){
        int base = 5;
        int ans =0;
        while(n>0){
            int last = n & 1;
            n = n>>1;
            ans += base * last;
            base *= 5;
        }
        return ans;
    }
}
