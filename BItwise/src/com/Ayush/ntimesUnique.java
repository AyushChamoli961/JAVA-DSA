package com.Ayush;

public class ntimesUnique {
        public static void main(String[] args) {
            int[] a = {9,1,4,5,9,9,1,4,5,5,4};
            int result = 0;
            for(int i=0; i< 8; i++){
                int x = 1 << i;
                int count =0;

                for(int j =0; j<a.length; j++){
                    if((a[j] & x) > 0){
                        count++;
                    }
                }

                if(count % 3 > 0){
                    result += x;
                }
            }

            System.out.println(result);
        }
    }

