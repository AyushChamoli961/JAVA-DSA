package com.Ayush;

import java.util.Arrays;

public class MaxiIn2dArrays {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 543, 5,},
                {63, 43, 6, 34, 435},
                {35, 43, 534, 345, 33}


        };


        System.out.println((maximum(arr)));

    }
    static int maximum(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col]>max){
                  max=arr[row][col];
                }

            }

        }
        return max;
    }

}
