package com.Ayush;

public class SearchinRoatatedArray {
    public static void main(String[] args) {
        int[] nums={15,18,19,27,2,3,4,5};
        int target=18;
        System.out.println(
                search(nums,target)
        );

    }
   static int search(int[] nums,int target ) {
        int pivot = pivot(nums);
        if (pivot==-1){
            return Binarysearch(nums,target,0, nums.length-1);
        }
        if (target==pivot){
            return pivot;
        }
        if(target<pivot)
        {
            return Binarysearch(nums,target,0,pivot-1);
        }


            return Binarysearch(nums,target,pivot+1, nums.length-1);

        }

    static  int pivot(int[] nums) {
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

