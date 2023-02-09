package com.Ayush;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,43,34,54,66};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void SelectionSort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaxindex( arr, 0, last);
            swap(arr,max,last);

        }
    }
    static void swap(int[] arr,int first ,int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second]=temp;

    }
    static int getMaxindex(int[] arr,int start,int end) {
            int max = start;
            for (int i = 0; i < arr.length; i++) {
                if (arr[max] < arr[i]) {
                    max = i;                }
            }
            return max;
        }

    }

