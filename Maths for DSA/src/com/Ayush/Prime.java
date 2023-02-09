package com.Ayush;

import java.util.ArrayList;

public class Prime {

    public static void main(String[] args) {
        int n = 97;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(primetillaNumber(40,list));
    }

    static boolean prime(int n) {
        int c = 2;
        if (n <= 1) {
            return false;
        }
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }


    static ArrayList<Integer> primetillaNumber(int n, ArrayList<Integer> list) {

        if (n <= 1) {
            list.add(-1);
            return list;
        }
        for (int i = 2; i <= n; i++) {
            int c = 2;
            int flag = 0;
            while (c * c <= i) {
                if (i % c == 0) {
                    flag++;
                    break;
                }
                c++;
            }
            if(flag==0){
                list.add(i);
            }
        }
        return list;
    }
}
