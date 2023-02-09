package com.Ayush;

//https://leetcode.com/problems/remove-element/submissions/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
//        Memory Usage: 43 MB, less than 17.15% of Java online submissions for Remove Element


import java.util.Arrays;


public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int ans = removeElement(arr,2);
        System.out.println(ans);
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
