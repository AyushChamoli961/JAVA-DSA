package com.Ayush;


//https://leetcode.com/problems/reach-a-number/

//Runtime: 2 ms, faster than 67.21% of Java online submissions for Reach a Number.
//        Memory Usage: 41.4 MB, less than 11.78% of Java online submissions for Reach a Number.

public class ReachANumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(11));
    }
    public static int reachNumber(int target) {
        int step=0;
        int sum = 0;
        target=Math.abs(target);
        for (int i = 0; i <=step; i++) {
            sum+=i;
            if(sum>=target && sum%2==target%2){
                break;
            }
            step++;
        }
        return step;
    }
}
