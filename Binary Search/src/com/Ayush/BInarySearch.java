package com.Ayush;


import org.w3c.dom.ls.LSOutput;

public class BInarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 43, 2, 45, 34, 2, 69, 67, 7, 5, 76, 56, 78, 574, 654};
        int target = 654;
        System.out.println("element fouund at"+Binarysearch(arr, target)+"index");
    }

    static int Binarysearch(int[] nums, int target) {
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
             return start;
            }

        }
        return -1;

    }
}