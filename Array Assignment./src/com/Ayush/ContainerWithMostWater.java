package com.Ayush;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,18,17,6};
        int ans = maxArea(arr);
        System.out.println(ans);
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxVolume = 0;
            for (int j = 0; j < height.length; j++) {
                maxVolume = Math.max(maxVolume,(end-start) * (Math.min(height[start],height[end])));
                if(height[start]>height[end]){
                    end--;
                }
                else {
                    start++;
                }
        }
        return maxVolume;
    }
}
