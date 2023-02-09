package com.Ayush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxValueofEquation {
    public static void main(String[] args) {
        int arr[][] = {{-19, -12}, {-13, -18}, {-12, 18}, {-11, -8}, {-8, 2}, {-7, 12}, {-5, 16}, {-3, 9}, {1, -7}, {5, -4}, {6, -20}, {10, 4}, {16, 4}, {19, -9}, {20, 19}};
//        int arr[][] = {{1,3},{2,0},{5,10}};
        System.out.println(findMaxValueOfEquation(arr, 6));
    }

    public static int findMaxValueOfEquation(int[][] points, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = 1; j < points.length; j++) {
                if (Math.abs((points[i][0] - points[j][0])) <= k) {
                    int x = points[i][1] + points[j][1] + Math.abs((points[i][0] - points[j][0]));
                    list.add(x);
                }

            }

        }
        System.out.println(list);
        return Collections.max(list);

    }
}
