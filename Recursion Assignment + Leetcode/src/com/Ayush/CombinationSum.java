package com.Ayush;

//https://leetcode.com/problems/combination-sum/


import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] arr = {2,4,3,7};
        List<List<Integer>> list = new ArrayList<>();
        list = combinationSum(arr,7);
        System.out.println(list);
    }

    //    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> list =  new ArrayList<>();
//        for (int i = 0; i < candidates.length; i++) {
//
//            for (int j = 0; j < candidates.length; j++) {
//                int sum = candidates[i];
//                int flag=0;
//                List<Integer> inner = new ArrayList<>();
//                if (sum!=target){
//                while(sum<=target){
//                    sum+=candidates[j];
//                    flag++;
//                    if(sum==target){
//                        inner.add(candidates[i]);
//                        for (int k = 0; k < flag; k++) {
//                            inner.add(candidates[j]);
//                        }
//                        list.add(inner);
//                    }
//
//                }
//            }
//                else {
//
//                    inner.add(candidates[i]);
//                    list.add(inner);
//                    break;
//                }
//
//                }
//        }
//        return list;
//
//        }

        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans=new ArrayList<>();
            solve(candidates,0,target,ans,new ArrayList<>());
            return ans;
        }
        public static void solve(int[] arr, int i, int target, List<List<Integer>> ansList, List list){
            if(target==0){
                ansList.add(new ArrayList<>(list));
                return;
            }
            if(i==arr.length){
                return;
            }
            if(target>=arr[i]){
                list.add(arr[i]);
                solve(arr,i,(target-arr[i]),ansList,list);
                list.remove(list.size()-1);
            }
            solve(arr,i+1,target,ansList,list);
        }

    }

