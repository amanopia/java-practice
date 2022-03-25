package com.company;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args){

        int[] arr = {1,2,0};

        int index = 0;
        while(index < arr.length){
            if(arr[index] != index){
                swap(arr, index, arr[index]);
            }
            index++;
        }
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index, int swapIndex){

        int temp = arr[index];
        arr[index] = arr[swapIndex];
        arr[swapIndex] = temp;
    }


}
