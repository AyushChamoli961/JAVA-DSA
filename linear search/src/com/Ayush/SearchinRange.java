package com.Ayush;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {1,543,54,674,66,43,-5,325,353,532,978};
        int target = 43;
        System.out.println(search(arr,target));
    }
    static boolean search(int[] arr, int target ){

        if (arr.length==0)
        {
            return false;
        }

        for (int i = 1; i <=5 ; i++) {
            if (target==arr[i]){
                return true;
            }
        }
            return false;
    }
}
