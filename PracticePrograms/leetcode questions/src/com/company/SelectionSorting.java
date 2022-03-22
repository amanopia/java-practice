package com.company;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args){

        int[] arr = {-3,-32,-10,45,10,11};

        for(int index = 0; index < arr.length; index++ ){
            int last = arr.length - index - 1;

            int largestIndex = maximum(arr, last);

            swap(arr, last, largestIndex);
        }
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr, int last, int largestIndex){
        int temp;
        temp = arr[largestIndex];
        arr[largestIndex] = arr[last];
        arr[last] = temp;

    }
    static int maximum(int[] arr, int last){
        int start = 0;

        int max = arr[start];
        int maxIndex = 0;
        for(int index = 0; index<= last; index++){
            if(arr[index] > max){
                max = arr[index];
                maxIndex = index;
            }
        }
        return maxIndex;
    }

}
