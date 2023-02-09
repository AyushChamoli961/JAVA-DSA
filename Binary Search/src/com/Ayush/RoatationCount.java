package com.Ayush;

public class RoatationCount {
    public static void main(String[] args) {
        int [] nums ={15,18,19,21,33, 2, 3, 6, 12};
        int count = 0;
        if(count==-1){
            System.out.println("array is not rotated");

        }
        System.out.println(count+1);

    }


    static int Rotationcount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid<end && nums[mid] > nums[mid + 1]) {

                return mid;
            }
            else if (mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]>nums[mid]) {
                end=mid-1;

            }
            else{
                start=mid+1;
            }


        }
        return -1;

    }
}
