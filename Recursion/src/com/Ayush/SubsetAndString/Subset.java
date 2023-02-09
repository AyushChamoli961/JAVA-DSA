package com.Ayush.SubsetAndString;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(subset(arr));
    }
    static List<List<Integer>> subset (int [] arr){
        List<List<Integer>>  outer  = new ArrayList<>(); // outer arraylist created
        outer.add(new ArrayList<>()); // an empty Arraylist inside outer is created

        for (int num : arr ) { //for every number in array
            int n =outer.size();
            for (int i = 0; i < n; i++) {
               List<Integer> internal = new ArrayList<>(outer.get(i));
                // n new internal arraylist created that are exact copy of ith list in outer
               internal.add(num);
               outer.add(internal);
            }

        }
        return outer;
    }
}
