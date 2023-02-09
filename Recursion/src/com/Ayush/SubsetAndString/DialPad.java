package com.Ayush.SubsetAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DialPad {
    public static void main(String[] args) {
        List<String> ans =letterCombinations("29");
        System.out.println(ans);
    }
    public static List<String> letterCombinations(String digits) {

        return helper("",digits,0);
    }

    private static List<String> helper(String p, String up,int count) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            if(count==0){
                return list;
            }
            else {
                list.add(p);
                return list;
            }
        }
        count++;
        int digit = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();
        if(digit<=6) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(helper(p + ch, up.substring(1),count));
            }
        }
        else if(digit==7 || digit==9) {
            int range = (digit == 7) ? (digit - 1) * 3 : (digit - 1) * 3 + 1;
            for (int i = (digit == 7) ? (digit - 2) * 3 : (digit - 2) * 3 + 1; i <= range; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(helper(p + ch, up.substring(1),count));
            }
        }
            else{
                for (int i = (digit-2)*3 + 1 ; i<= (digit-1)*3 ; i++) {
                    char ch = (char) ('a' + i);
                    ans.addAll(helper(p + ch, up.substring(1),count));
                }
            }
        return ans;
    }
}
