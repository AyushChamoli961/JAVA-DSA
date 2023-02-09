package com.Ayush.SubsetAndString;

//https://leetcode.com/problems/length-of-last-word/submissions/

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
//        Memory Usage: 41.8 MB, less than 81.13% of Java online submissions for Length of Last Word.
public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "k";
        int ans = lengthOfLastWord(str);
        System.out.println(ans);
    }
    public static int lengthOfLastWord(String s) {
        int l=s.length()-1;
        int j = 0;

        while(s.charAt(l)==' '){
            l--;
        }
        while(l>=0 && s.charAt(l)!=' ' ){
            j++;
            l--;
        }
        return j;
    }
}
