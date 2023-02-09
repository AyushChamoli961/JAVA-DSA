//leetcode medium
//34. Find First and Last Position of Element in Sorted Array
//Medium
//
//9808
//
//280
//
//Add to List
//
//Share
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]
package com.Ayush;

public class CeilingoftheNumber {
    public static void main(String[] args) {
        int[] arr={3,5,34,48,56,67,78,89};
        int target=65;
        System.out.println(ceiling(arr,target));

    }
    static int ceiling(int[] nums,int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                return nums[mid];
            }

        }
        return nums[start];

    }
}


