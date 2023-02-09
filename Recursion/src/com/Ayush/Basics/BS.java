package com.Ayush.Basics;

public class BS {
    public static void main(String[] args) {
        int[] arr= {1,2,4,6,53,57,69,78};
        int target=78;
        int ans= BinarySearch(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    static int BinarySearch(int[] arr , int target, int s , int e){

        if(s>e){
            return -1;
        }
        int m= s + (e-s)/2;

        if(target==arr[m]){
            return m;
        }
        if(target>m){
            return BinarySearch(arr,target,m+1,e);
        }
        return BinarySearch(arr,target,s,m-1);

    }

}
