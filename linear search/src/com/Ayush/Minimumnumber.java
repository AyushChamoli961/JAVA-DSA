package com.Ayush;

import javax.sound.midi.Soundbank;

public class Minimumnumber {
    public static void main(String[] args) {
        int[] arr = {1, 543, 54, 674, 66, 43, -5, 325, 353, 532, 978};
        System.out.println(min(arr));

    }
    static  int min(int[] arr){
        int min = arr[0];
        if (arr.length==0){
            return 0;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;

    }




    }

