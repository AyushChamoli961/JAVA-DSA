package com.Ayush;

public class TargetSum {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int ans = findTargetSumWays(arr, 3);
        System.out.println(ans);
    }

    public static int findTargetSumWays(int[] nums, int target) {

        if (nums.length == 0) return 0;
        return helper(nums, target, nums.length - 1);
    }

    static int helper(int[] nums, int target, int index) {
        if (index == 0) {

            if (target - nums[0] == 0 || nums[0] + target == 0) {


                if (nums[0] == 0) return 2;
                return 1;
            } else return 0;
        }

        int positive = helper(nums, target + nums[index], index - 1);

        int negative = helper(nums, target - nums[index], index - 1);

        return positive + negative;


    }
}
