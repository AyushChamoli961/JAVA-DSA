package com.Ayush;

public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }
    static int splitArray(int[]  nums , int m){
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]);//it will contain max item in the loop.
            end+=nums[i];


        }
        while(start<end){
            //try potential answer
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int num:nums) {
                if (sum+num>mid){
                    //sum is exceeded the middle value
                    //hence a new subarray is created containing mid as new element and pieces = pieces+!
                    sum=mid;
                    pieces++;
                }
                else{
                    sum+=num;
                }
                if(pieces> m ){
                    start=mid+1;
                }
                else{
                    end=mid;
                }



            }



        }
        return end;//at end start=end=mid

    }
}
