package com.Ayush.LLQUestions;

import java.util.Scanner;

public class Newton {

    static int maxGCD(int a[], int n , int b)
    {

        int []Prefix = new int[n + 2];
        int []Suffix = new int[n + 2];
        Prefix[1] = a[0];
        for (int i = 2; i <= n; i += 1)
        {
            Prefix[i] = __gcd(Prefix[i - 1],
                    a[i - 1]);
        }

        Suffix[n] = a[n - 1];
        for (int i = n - 1; i >= 1; i -= 1)
        {
            Suffix[i] = __gcd(Suffix[i + 1],
                    a[i - 1]);
        }

        int ans = Math.max(Suffix[2], Prefix[n - 1]);

        // If any other element is replaced
        for (int i = 2; i <n; i += 1)
        {
            ans = Math.max(ans, __gcd(Prefix[i - 1],
                    Suffix[i + 1]));
        }

        // Return the maximized gcd
        return ans;
    }

    static int __gcd(int a, int b)
    {
        return b == 0 ? a : __gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int size = in.nextInt();
        int b = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int ans  = maxGCD(arr,size,b);
        System.out.println(ans);

    }
}
