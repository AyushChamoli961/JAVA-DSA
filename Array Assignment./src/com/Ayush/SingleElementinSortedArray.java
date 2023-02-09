package com.Ayush;

public class SingleElementinSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
    public static int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if (nums[mid]!=nums[mid+1] && nums[mid]!= nums[mid-1]){
                return nums[mid];
            }
            if(nums[s]!=nums[s+1] )
            {
                return nums[s];
            }
            if(nums[e]!=nums[e-1])
            {
                return nums[e];
            }
            s=s+2;
            e=e-2;

        }
        return -1;
    }
}
