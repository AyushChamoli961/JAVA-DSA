package com.Ayush;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for (int j = 1; j< nums.length ; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
                //we are bringing ahead the unique elements and shifting back dupliactes
                //at last when whole array is traversed we return i+1 as i=0 initialy
            }
        }
        return i+1;
    }
}
