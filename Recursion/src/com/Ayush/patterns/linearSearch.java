package com.Ayush.patterns;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 234, 63, 432, -43};
        System.out.println(search(arr, -43, 0));
    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return search(arr, target, index + 1);
        }
    }
}
