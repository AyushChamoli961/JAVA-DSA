package com.Ayush;

import java.util.Arrays;

public class Searchin2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 543, 5,},
                {63, 43, 6, 34, 435},
                {35, 43, 534, 345, 33}


        };
        int target = 435;

        System.out.println(Arrays.toString(search2(arr, target)));
        search(arr, target);
    }
    static int  search(int[][] arr,int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (target==arr[row][col]){
                    System.out.println("element found at index ["+row+"]"+"["+col+"]");
                }

            }

        }
        return -1;
    }
    //alternative method
    static int[]  search2(int[][] arr,int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (target==arr[row][col]){
                    return new int[]{row,col};
                }

            }

        }
        return new int[]{-1,-1};

    }
}


