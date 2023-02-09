package com.Ayush.SubsetAndString;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
   static int[] plusOne(int[] digits) {
               for(int i=digits.length-1;i>=0;i--)
               {
                   if(digits[i]!=9)
                   {
                       digits[i]++;
                       return digits ;
                   }
                   else
                       digits[i]=0;
               }
               int[] num=new int[digits.length+1];
               num[0]=1;
               return num;
           }
       }
