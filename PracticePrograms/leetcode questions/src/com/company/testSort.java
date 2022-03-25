package com.company;

import java.util.Arrays;

public class testSort {
    public static void main(String[] args){
        // In selection sort we find the greatest number

        int[] arr = {5,4,3,2,1};
        for(int index = 0; index < arr.length; index++){
            int last =  arr.length - index - 1;

            int max = maximum(arr, last);
            swap(arr, last, max);
        }
        System.out.print(Arrays.toString(arr));
    }
    static int maximum(int[] arr, int last){
        int max = arr[0];
        int maxIndex = 0;
        for(int index = 0; index<=last; index++){
            if(arr[index] > max){
                max = arr[index];
                maxIndex = index;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int last, int maxIndex){

        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
