package com.Ayush.Basics;

import javax.sound.midi.MidiFileFormat;

public class sum {
    public static void main(String[] args) {
        int ans = count(100002,0);
        System.out.println(ans);
    }

    static int count(int n ,int c){
        return helper(n,c);
}

    private static int helper(int n, int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return helper(n/10,c+1);
        }
        return helper(n/10 , c);
    }
}
