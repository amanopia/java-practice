package com.company;

import java.util.Arrays;

public class SelSort {
    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};

        for(int index = 0; index<arr.length; index++){
            int last = arr.length - index - 1;

            int maxIndex = maximum(arr, last);

            swap(arr, maxIndex, last);
        }
        System.out.print(Arrays.toString(arr));
    }
    static int maximum(int[] arr, int last){

        int max = arr[0];
        int maximumIndex = 0;
        for(int index = 1; index<=last; index++){
            if(arr[index] > max){
                maximumIndex = index;
            }
        }
        return maximumIndex;
    }
    static void swap(int[] arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
