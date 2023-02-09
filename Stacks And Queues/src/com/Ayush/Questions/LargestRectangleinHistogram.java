package com.Ayush.Questions;

import java.util.Stack;

public class LargestRectangleinHistogram {
            public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        int ans = largestRectangleArea(heights);
        System.out.println(ans);
    }
//    static int largestRectangleArea(int[] heights) {
//                if(heights.length==0){
//                    return heights[0];
//                }
//
//            int maxCount = 0;
//            for (int i = 0; i < heights.length ; i++) {
//                int count = 0;
//                int j = i;
//                int k = i+1;
//                while( j>=0 &&  k<heights.length){
//                    if(heights[j] >= heights[i]){
//                        count+=1;
//                        j--;
//                    }
//                    if(heights[k] >= heights[i]){
//                        count+=1;
//                        k++;
//                    }
//                    j--;
//                    k++;
//
//                }
//                count = heights[i]*count;
//                if(count > maxCount){
//                    maxCount = count;
//                }
//            }
//            return maxCount;
//    }
        static int largestRectangleArea(int[] heights) {
            Stack<Integer> stack = new Stack<>();
            int max = 0;

            stack.push(0);

            for (int i = 1; i < heights.length; i++) {
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                    max = getMax(heights, stack, max, i);
                }
                stack.push(i);
            }

            int i = heights.length;
            while (!stack.isEmpty()) {
                max = getMax(heights, stack, max, i);
            }
            return max;
        }

            private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
                int area;
                int popped = stack.pop();
                if (stack.isEmpty()) {
                    area = arr[popped] * i;
                } else {
                    area = arr[popped] * (i - 1 - stack.peek());
                }
                return Math.max(max, area);
            }
}
