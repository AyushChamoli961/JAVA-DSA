package com.Ayush;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twosum(arr,target)));
    }
    static int[] twosum(int[] arr,int target)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
            }

        }

    }
        return new int[]{-1,-1};
}
}
