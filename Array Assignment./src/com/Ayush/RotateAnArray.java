package com.Ayush;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,32,2,21};
        int k=2;
        rotate2(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    //Method 1 not applicable for large arrays.
    static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int x = nums[nums.length - 1];
            for (int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = x;
        }
    }
    //Method 2
    static void rotate2(int[] nums ,  int k){
        int[] arr = new int[nums.length];
        for (int i = 0; i< nums.length ; i++) {
            arr[(i+k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}
