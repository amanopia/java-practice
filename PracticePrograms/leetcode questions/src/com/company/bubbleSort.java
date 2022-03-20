package com.company;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 4};

        System.out.print("final sorted array: ");
        System.out.print(Arrays.toString(bubble(arr)));

    }
    static int[] bubble(int[] arr){

        int temp;
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    // This value will be converted to true once there is a swap
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
