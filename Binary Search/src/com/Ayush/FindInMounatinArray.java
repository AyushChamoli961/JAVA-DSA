package com.Ayush;

public class FindInMounatinArray {
    public static void main(String[] args) {


    }
    int search(int[] nums,int target){
        int peak=peakIndexInMountainArray(nums);
        int firsttry=orderAgnosticBS(nums,target,0,peak);
        if (firsttry!=-1){
            return firsttry;
        }
        return orderAgnosticBS(nums,target,peak+1, nums.length-1);


    }

     static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid]>nums[mid+1]) {
                //you ae in decreasing part of thge array
                //this may be the answer but look at left side of the array
                //this is why end!=mid-1;
                end = mid;
            } else {
                //you are in ascending part of the array
                start = mid+1;
                //because we know that mid+1 element > mid element
            }
            //Now above two checks will work as binary saerch.
            //and work till start=end


        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =


    }

    static int orderAgnosticBS(int[] arr, int target,int start,int end) {

         start = 0;
         end = arr.length - 1;
        boolean isAsc = arr[end] > arr[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc == true) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }


        }
        return -1;
    }
}
