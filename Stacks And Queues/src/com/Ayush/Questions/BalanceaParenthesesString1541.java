package com.Ayush.Questions;

import java.util.Stack;

public class BalanceaParenthesesString1541 {
    public static void main(String[] args) {
        String s = "())(";
        System.out.println(minInsertions(s));
    }
    public static int minInsertions(String s) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (stack.isEmpty() || stack.peek() == 2) {
                    stack.push(2);
                } else {
                    stack.pop();
                    stack.push(2);
                    ans++;
                }
            } else {
                if (stack.isEmpty()) {
                    ans++;
                    stack.push(1);
                } else if (stack.peek() == 1) {
                    stack.pop();
                } else if (stack.peek() == 2) {
                    stack.pop();
                    stack.push(1);
                }
            }
        }
            while(!stack.isEmpty()){
                ans+=stack.pop();
            }

        return ans;
    }
}
