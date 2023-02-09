package com.Ayush;

import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix-ii/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
//        Memory Usage: 42 MB, less than 50.97% of Java online submissions for Spiral Matrix II.

public class SpiralMatrixII {
    public static void main(String[] args) {
        int[][] arr = generateMatrix(5);
        for (int i = 0; i <5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        int x=1;

        while(x<=n*n){
            //for top
            for(int i=left;i<=right;i++)
                res[top][i]=x++;
            top++;

            //for right side
            for(int i=top;i<=bottom;i++)
                res[i][right]=x++;
            right--;

            //for bottom
            for(int i=right;i>=left;i--)
                res[bottom][i]=x++;
            bottom--;

            //for left side
            for(int i=bottom;i>=top;i--)
                res[i][left]=x++;
            left++;
        }

        return res;

    }



    }
