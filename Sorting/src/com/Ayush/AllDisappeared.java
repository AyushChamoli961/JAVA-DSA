package com.Ayush;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Asked in google


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDisappeared {
    public static void main(String[] args) {


    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {

                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {

                ans.add(index);
            }
        }
        return ans;
    }





    static void swap(int[] arr,int first ,int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second]=temp;

    }
}
