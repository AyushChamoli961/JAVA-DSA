package com.Ayush;
//https://leetcode.com/problems/find-the-duplicate-number/
//Amazon interview Question

import java.util.ArrayList;
import java.util.List;

public class Dupicate {
    public static void main(String[] args) {
        int [] arr={1,3,4,2,2};
        int ans= findDuplicate(arr);
        System.out.println(ans);

    }

   static  int findDuplicate(int[] nums) {
        int i = 0;
        int ans = 0;

        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {

                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {
                ans = nums[index];
            }
        }
        return ans;


    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
