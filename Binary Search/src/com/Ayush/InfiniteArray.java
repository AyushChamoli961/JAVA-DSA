package com.Ayush;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr,target));

    }
    static int ans(int nums[], int target ) {
        int start = 0;
        int end = 1;
        //condition for checkiing whether the target is in range or not
        if (target > nums[end]) {
            int newStart = end + 1;
            //and we will double the size of our checking box
            //previous end=previous end + (previous end-start*2)
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return Binarysearch(nums,target,start,end);
    }

    static int Binarysearch(int[] nums, int target,int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return -1;

    }
}

