package com.Ayush.Questions;

import java.util.List;

public class GameofStacks {


    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return helper(maxSum, a, b, 0, 0) - 1;

    }

    private static int helper(int maxSum, List<Integer> a, List<Integer> b, int sum, int count) {
        if (sum > maxSum) {
            return count;
        }
        if (a.isEmpty() || b.isEmpty()){
            return count;
        }
        int ans1 = helper(maxSum, a.subList(1, a.size()), b, sum + a.get(0), count++);
        int ans2 = helper(maxSum, a, b.subList(1, a.size()), sum + b.get(0), count++);
        return Math.max(ans1, ans2);
    }
}
