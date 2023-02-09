package com.Ayush;

public class EvenNoofDigits {
    public static void main(String[] args) {
        int[] arr = {1,5,32,355,234,33,35,21};
        System.out.println(Evendigit(arr));

    }
    static int Evendigit(int[] arr) {
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            if(digits(arr[i])%2==0){
                count = count + 1;
            }
        }


        return count ;
    }
    //how to count no of digits
    static int  digits(int num){
        int count = 0;
        while(num>0){
            count = count +1;
            num=num/10;
        }
        return count;
    }
    }

