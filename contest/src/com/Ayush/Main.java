package com.Ayush;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zones = in.nextInt();
        int req = in.nextInt();
        int left  = in.nextInt();
        int net  = req-left;
        int flag = 0;
        int[] arr = new int[zones];
        for (int i = 0; i < zones; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < zones; i++) {
            if(arr[i] == net){
                flag++;
                System.out.println("YES");
                break;
            }
        }
        if(flag == 0){
            System.out.println("NO");
        }


    }
}
