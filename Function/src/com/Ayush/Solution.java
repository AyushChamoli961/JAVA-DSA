package com.Ayush;

import java.util.Scanner;


class Solution
{
    public static void main(String args[])
    {
        int n = 1234;
        System.out.println(subtractProductAndSum(n));
    }
    static int subtractProductAndSum(int n)
    {
        int product = 1 , sum = 0;
        while(n > 0)
        {
            //n % 10 extracts the last digit out of N
            product *= (n % 10);
            sum += (n % 10);
            n /= 10;
        }
        return product - sum;
    }
}