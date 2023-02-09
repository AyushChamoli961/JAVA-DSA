package com.Ayush;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,5};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] != 0){
                    swap(nums,j,i);
                    i++;
                }
            }
        System.out.println(Arrays.toString(nums));
        }

    private static void swap(int[] nums, int j,int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}