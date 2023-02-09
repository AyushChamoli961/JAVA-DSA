package com.Ayush;

public class FirstandLastPositionofElement {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;

    }
    //this function return the index value of what we are trying to saerch
    int search(int[] nums,int target,boolean findStartIndex){
        int start=nums[0];
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end =  mid-1;
            }
            else{
                //potential ans found
                ans=mid;
                if (findStartIndex==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }

        }
        return ans;
    }
}
