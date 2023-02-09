package com.Ayush;

import java.util.Arrays;

//https://leetcode.com/problems/majority-element/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Majority Element.
//        Memory Usage: 45.7 MB, less than 96.49% of Java online submissions for Majority Element.

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int m = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                m = nums[i];
                count = 1;
            } else {
                if (nums[i] == m) {
                    count--;
                } else {
                    count--;
                }
            }
        }

        // if m occurs more than n / 2 times
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != m) {
                count++;
            }

            if (count > nums.length / 2)
                return m;
        }

        return -1;
    }
}
