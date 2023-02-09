package com.Ayush.SubsetAndString;

import java.util.ArrayList;
import java.util.Arrays;

public class Subseq {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list = subSeq("" , "abc");
        subseqAscii("","abc");
    }

    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseq(p + up.charAt(0) , up.substring(1));
        subseq(p , up.substring(1));
    }

    static ArrayList<String> subSeq(String p , String up){

        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        ArrayList<String> left = subSeq(p + up.charAt(0) , up.substring(1));
        ArrayList<String> right= subSeq(p , up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseqAscii(p + up.charAt(0) , up.substring(1));
        subseqAscii(p , up.substring(1));
        subseqAscii(p +(up.charAt(0)+0), up.substring(1));
    }
}
