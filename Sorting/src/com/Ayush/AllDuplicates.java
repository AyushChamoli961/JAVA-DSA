package com.Ayush;

public class AllDuplicates {
    public static void main(String[] args) {

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
