package com.Ayush.Arrays;

import java.util.ArrayList;

public class serachlinear {
    public static void main(String[] args) {
        int[] arr = {56, 1, 243, 21, -34, 56, 32, 56, 87, 56, 43};
        int target = 56;
        ArrayList<Integer> ans = search2(arr, target, 0);
        System.out.println(ans);
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> search(int[] arr, int target, ArrayList<Integer> list, int index) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return search(arr, target, list, index + 1);

    }

    static ArrayList<Integer> search2(int[] arr, int target,  int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls =   search2(arr, target, index + 1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}

