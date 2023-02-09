package com.Ayush;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int target = 5;
        System.out.println("item foud at"+orderAgnosticBS(arr, target)+"index");

    }


    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[end] > arr[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc == true) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }


        }
        return -1;
    }
}

