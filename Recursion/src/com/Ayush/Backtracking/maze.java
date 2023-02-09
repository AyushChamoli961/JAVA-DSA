package com.Ayush.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class maze {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        ans = pathList("",3,3);
        System.out.println(ans);
        path("",3,3);
    }

    static int numberofWays(int r , int c){

        if (r == 1 || c==1) {
            return 1;
        }

        int right = numberofWays(r, c-1);
        int down = numberofWays(r-1 , c);

        return right+down;
    }

    static void path(String p, int r , int c){
        if (r == 1 && c==1) {
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p+"D",r-1,c);
        }
        if(c > 1){
            path(p+"R",r , c-1);
        }
        if(c>1 && r>1){
            path(p+"X",r-1,c-1);
        }
    }

    static List<String> pathList(String p , int r , int c){

        if (r == 1 && c==1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(r>1) {
            ans.addAll(pathList(p + "D", r-1, c));
        }
        if(c>1) {
             ans.addAll(pathList(p + "R", r , c-1));
        }
        return ans;
    }


}
