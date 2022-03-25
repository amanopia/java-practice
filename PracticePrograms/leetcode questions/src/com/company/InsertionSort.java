package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){

        int[] arr = {1,2,3};

        for(int index = 0; index <= arr.length - 2; index++){

            for(int j= index + 1; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }

            }
        }
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr, int firstIndex, int lastIndex){
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[firstIndex];
        arr[firstIndex] = temp;
    }
}

