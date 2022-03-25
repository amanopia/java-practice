package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};

        for(int index = 0; index<arr.length-1;index++){

            while(index != arr[index]-1){
                swap(arr, arr[index]);
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int value){
        int temp = value;
        value = arr[value-1];
        arr[value-1] = temp;
    }
}
