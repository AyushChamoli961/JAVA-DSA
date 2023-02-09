package com.Ayush;

public class FloorofAnumber {
    public static void main(String[] args) {
        int [] arr={1,4,6,14,23,45,49,78};
        int target = 46;
        System.out.println(floorofanumber(arr,target));

    }
    static int floorofanumber(int[] arr,int target){
        int start=arr[0];
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                ;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];


    }
}


