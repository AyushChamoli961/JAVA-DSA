package com.Ayush;

import java.util.Arrays;

public class ConcentrationofArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(Concentration(nums)));
    }

    static int[] Concentration(int[] nums) {
        int[] ans  = new int[2*nums.length];
        int n= nums.length;


        for (int i = 0; i <nums.length; i++) {
            {
                ans[i] = nums[i];

            }


        }
        return ans;

    }
}