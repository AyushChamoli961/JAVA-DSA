package com.Ayush;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,3};
        int ans = Unique(arr);
        System.out.println(ans);
    }
    static int Unique(int arr[]){
        int unique = 1;
        for(int n : arr ){
            unique ^= n;
        }
        return unique;

    }
}
