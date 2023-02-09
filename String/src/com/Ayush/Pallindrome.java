package com.Ayush;

public class Pallindrome {
    public static void main(String[] args) {
        String str = "abccccba";
        if (whilepallin(str) == true) {
            System.out.println("pallindrome");

        } else {
            System.out.println("not pallindrome");

        }
    }
    static boolean pallin(String str) {
        str = str.toLowerCase();
        if (str==null || str.length()==0)
        {
            return true;
        }

        for (int i = 0; i < str.length()-1; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }



        }
        return true;
    }
    static boolean whilepallin(String str){
        str = str.toLowerCase();
        if (str==null || str.length()==0)
        {
            return true;
        }
        int i=0;
        int j= str.length()-1;
        char start = str.charAt(i);
        char end = str.charAt(j);
        while(i<=j){
            if(start!=end){
                return false;

            }
            i++;
            j--;
            start = str.charAt(i);
            end= str.charAt(j);

        }
        return true;
    }


}
