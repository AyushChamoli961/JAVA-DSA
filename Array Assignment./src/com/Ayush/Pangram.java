package com.Ayush;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class Pangram {
    public static void main(String[] args) {
        String str = "";
        boolean ans = checkIfPangram(str);
        System.out.println(ans);
    }

    public static boolean checkIfPangram(String sentence) {
        int x =0;
        for (int i = 97; i <=122; i++) {
            int k=0;
            {
                for (int j = 0; j < sentence.length() ; j++) {
                char ch = sentence.charAt(j) ;
                if (i==ch) {
                    x++;
                    k++;
                    break;
                    }
                }
                if(k==0){
                    return false;
                }

            }
            if(x==26){
                return true;
            }
        }
        return false;
    }
}
