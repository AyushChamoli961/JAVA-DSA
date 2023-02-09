package com.Ayush.Questions;

import java.util.Stack;

public class ValidParantthesis {
    public static void main(String[] args) {
        String s = "[({})]";
        boolean ans = isValid(s);
        System.out.println(ans);

    }
    public static boolean isValid(String s) {

        Stack <Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }

                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }

                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
        }


    }
