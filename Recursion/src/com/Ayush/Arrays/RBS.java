package com.Ayush.Arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3};
        int target = 6;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr , int target, int s ,int e) {
        int m = s + (e - s) / 2;
        if (target == arr[m]) {
            return m;
        }
        if (arr[s] <= arr[m]){
            if (target <= arr[m] && target >= arr[s]) {
               return search(arr, target, s, m - 1);
        }
            else {
               return search(arr, target, m + 1, e);
        }
    }
        if(target>=arr[m] && target<=arr[e]) {
            return search(arr, target, m + 1, e);
        }
        else {
            return search(arr, target, s, m - 1);
        }


    }
}
