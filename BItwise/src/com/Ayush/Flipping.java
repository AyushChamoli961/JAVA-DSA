package com.Ayush;

import java.util.Arrays;

public class Flipping {
    public static void main(String[] args) {
        int[][] arr = {
                {1,0,0},
                {1,1,0},
                {0,1,0}
        };
        int[][] ans = flip(arr);

    }
    static int[][] flip(int[][] image){
        for(int[] row : image){
            for (int i = 0; i < (image[0].length) ; i++) {

                int temp =  row[i] ^ 1;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;

            }
        }
        return image;
    }
}
