package com.Ayush;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
//        Memory Usage: 50.4 MB, less than 92.34% of Java online submissions for Product of Array Except Self.

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] nums) {
            int[] ans = new int[nums.length];
            int prod=1;
            for (int i=0;i<nums.length;i++) {
                ans[i]=prod;
                prod*=nums[i];
            }
            prod=1;
            for(int i=nums.length-1;i>=0;i--) {
                ans[i]*=prod;
                prod*=nums[i];
            }
            return ans;
        }
}
