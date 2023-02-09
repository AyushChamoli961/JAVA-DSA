package com.Ayush.Sorting;

import java.util.Arrays;

public class QuickSOrt {
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3,9};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr, int lo, int hi){
        if(lo >= hi)
        {
            return;
        }
        int s = lo;
        int e = hi;
        int m= s + (e-s)/2;
        int pivot = arr[m];

        while (s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }
        sort(arr,lo,e);
        sort(arr,s,hi);
    }
}
