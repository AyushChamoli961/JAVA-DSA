package com.Ayush;

public class longestPalnedrome {
    public static void main(String[] args) {
        String str = longestPalindrome("abcbadbcb");
        System.out.println(str);
    }

    public static String longestPalindrome(String s) {
        int start  = 0;
        int end = s.length()-1;
        String left = "";
        String right= "";
         while(start<=end){
            if(s.charAt(start) == s.charAt(end)) {
                if (start == end) {
                    left = left + s.charAt(start);
                } else {
                    left = left + s.charAt(start);
                    right = s.charAt(end) + right;
                }
            }
            else{
                left = "";
                right = "";
            }
            start++;
            end--;

        }
        return left+right;
    }
}
