package com.Ayush.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Nqueens {
    public static void main(String[] args) {
        boolean[][] matrix = new boolean[4][4];
        int ans = NoQueens(matrix , 0);
        System.out.println(ans);
    }

    public static int NoQueens(boolean[][] matrix, int r) {
        if (r == matrix.length) {
            display(matrix, r);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int c = 0; c < matrix.length; c++) {
            if (isSafe(matrix, r, c)) {
                matrix[r][c] = true;
                count += NoQueens(matrix, r + 1);
                matrix[r][c] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] matrix, int r, int c) {
        //Vertical up
        for (int i = 0; i <r; i++) {
            if (matrix[i][c]) {
                return false;
            }
        }
        //Diagonal left
        int minLeft = Math.min(r,c);
        for (int i = 0; i <= minLeft; i++) {
            if (matrix[r - i][c - i]) {
                return false;
            }
        }
        //Diagonal right
        int maxRight = Math.min(r, matrix.length-c-1)  ;
        for (int i = 0; i <=maxRight; i++) {
            if (matrix[r - i][c + i]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] matrix, int r) {
        for (boolean[] row : matrix) {
            for (boolean element : row) {
                if (element == true) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }

    }


}
