package com.Ayush;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
//                {1,1,1},
//                {1,0,1},
//                {1,1,1}
                {0,1}
        };
        int [][] ans = setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] setZeroes(int[][] matrix) {
        
                int r = matrix.length;
                int c = matrix[0].length;
                Boolean isCol = false;

                for (int i = 0; i < r; i++) {

                    
                    if (matrix[i][0] == 0) {
                        isCol = true;
                    }

                    for (int j = 1; j < c; j++) {
                        if (matrix[i][j] == 0) {
                            matrix[0][j] = 0;
                            matrix[i][0] = 0;
                        }
                    }
                }

                for (int i = 1; i < r; i++) {
                    for (int j = 1; j < c; j++) {
                        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                            matrix[i][j] = 0;
                        }
                    }
                }

                if (matrix[0][0] == 0) {
                    for (int j = 0; j < c; j++) {
                        matrix[0][j] = 0;
                    }
                }

                if (isCol) {
                    for (int i = 0; i < r; i++) {
                        matrix[i][0] = 0;
                    }
                }
                return matrix;
            }
        }
