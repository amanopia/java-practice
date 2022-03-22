package com.company;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args){

        int[] arr = {4,5,3,1,2 };

        for(int index = 0; index < arr.length; index++ ){
            int last = arr.length - index - 1;

            int largestIndex = maximum(arr, last);

            int temp;
            temp = arr[largestIndex];
            arr[largestIndex] = arr[last];
            arr[last] = temp;
        }
        System.out.print(Arrays.toString(arr));
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
