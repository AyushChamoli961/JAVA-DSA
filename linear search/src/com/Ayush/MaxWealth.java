package com.Ayush;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumwealth(arr));
    }
        static int maximumwealth (int[][] accounts) {
            int ans = Integer.MIN_VALUE;
            int sum = 0;
            for (int row = 0; row < accounts.length; row++) {
                for (int col = 0; col < accounts[row].length; col++) {
                    sum += accounts[row][col];
                }

                    if (sum > ans) {
                        ans = sum;
                    }


            }
            return ans;

        }
}


