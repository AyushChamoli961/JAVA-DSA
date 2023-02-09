package com.Ayush;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 93};
        double ans = findMedianSortedArrays(nums1, nums2);

        System.out.println(ans);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] merge = new int[nums1.length + nums2.length];

            int i = 0;
            int j = 0;
            int k = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    merge[k] = nums1[i];
                    i++;

                } else {
                    merge[k] = nums2[j];
                    j++;
                }
                k++;
            }
            while (i < nums1.length) {
                merge[k] = nums1[i];
                i++;
                k++;
            }
            while (j < nums2.length) {
                merge[k] = nums2[j];
                j++;
                k++;
            }
            int l = merge.length;
            if (l % 2 == 0) {
                return (double)(merge[l / 2] + merge[(l / 2) - 1]) / 2;
            } else {
                return (double) merge[l / 2];
            }

        }
    }