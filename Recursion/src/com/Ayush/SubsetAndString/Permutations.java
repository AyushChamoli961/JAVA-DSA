package com.Ayush.SubsetAndString;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
//       permutations("","abc");
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }
    static void permutations( String p , String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f + ch + s,up.substring(1));
        }
    }
    static List<String> permutationsList( String p , String up){
        if(up.isEmpty()) {
            List<String> list =  new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        List<String> ans = new ArrayList<>();

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsList(f + ch + s,up.substring(1)));
        }
        return ans;
    }
    static int CountPermutations( String p , String up){
        if(up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count+=CountPermutations(f + ch + s,up.substring(1));
        }
        return count;
    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        permutations(list,nums,0);
        return list;
    }
////    https://leetcode.com/problems/permutations/
//    Runtime: 0 ms, faster than 100.00% of Java online submissions for Permutations.
//    Memory Usage: 43 MB, less than 85.16% of Java online submissions for Permutations.

    public static void permutations (List<List<Integer>> ans, int[] nums,int index){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            ans.add(list);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i,index,nums);
            permutations(ans,nums,index+1);
            swap(i,index,nums);
        }//backtracking array for future recursion calls.
    }

    private static void swap(int i, int index, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
