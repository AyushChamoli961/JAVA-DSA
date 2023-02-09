package com.Ayush;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 38, 74, 323, 43};
        int target = 5;
        System.out.println("eleemnt found at " + linearsearch3(nums, target) + " index");


    }

    //search array for target
    //if not found return -1
    static int linearsearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }

        //this return statement will execute if none of return statements work
        //target not found
        return -1;
    }

    static int linearsearch2(int[] arr, int target) {

        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        //run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
            return Integer.MAX_VALUE;

    }

    static boolean linearsearch3(int[] arr, int target) {

        if (arr.length == 0) {
            return false;
        }
        //run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;

    }


}