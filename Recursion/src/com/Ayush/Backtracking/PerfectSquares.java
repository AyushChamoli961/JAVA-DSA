package com.Ayush.Backtracking;


public class PerfectSquares {
    public static void main(String[] args) {
        int ans = numSquares(11);
        System.out.println(ans);
    }

    public static int numSquares(int n) {
        return count(n,0);
    }

    private static int count(int n, int c) {
        if(n==1){
           return 1;
        }
        int temp = isPerfectSquare(n);

      c+=count(n-temp,c);
      c=0;
      return c;
     }

    public static int isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(mid*mid==num) {
                return num;
            }
            else if(mid*mid<num) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return 1;
    }
}
