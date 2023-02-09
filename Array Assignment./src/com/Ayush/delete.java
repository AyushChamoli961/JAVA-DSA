package com.Ayush;

import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int[][] arr2D = {
                {1, 2, 3},
                {4, 3, 3},
                {67, 43, 43}
        };
        int[] arr = {1,2,46,7456,45};
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col]+"  ");
            }
            System.out.println();
        }
    }
}
