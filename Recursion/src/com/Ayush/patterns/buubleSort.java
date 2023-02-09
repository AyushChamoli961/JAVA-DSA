package com.Ayush.patterns;

import java.util.Arrays;

public class buubleSort {
    public static void main(String[] args) {
        int[] nums = {3,5,221,55,78};
        bubble(nums, nums.length-1,0);
        System.out.println(Arrays.toString(nums));
    }
    static void bubble(int[] nums,int r,int c){
       if(r==0){
           return;
       }
       if(c<r) {
           if (nums[c] > nums[c + 1]) {
                   int temp = nums[c];
                   nums[c] = nums[c + 1];
                   nums[c + 1] = temp;
               }
               bubble(nums, r, c + 1);

           }
       else{
           bubble(nums,r-1,0);
       }

    }
}
