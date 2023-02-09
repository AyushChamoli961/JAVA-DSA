package com.Ayush;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums={3,4,32,1,45,-3892};
        Bublesort(nums);
        System.out.println(Arrays.toString(nums));
    }
	// write your code here
        static void Bublesort(int[] nums){
            boolean swapped;
            int temp;
            swapped=false;
            //run the loop N-1 times
            for (int i = 0; i < nums.length; i++) {
                //for each term maximum item will come at last respective index
                for (int j = 1; j < nums.length-i; j++) {
                    //swap if the item is samller than the previous one
                    if(nums[j]<nums[j-1]){
                        //swap
                        temp=nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=temp;
                        swapped = true;
                    }

                }
                if(!swapped){
                    break;
                }

            }
        }
    }

