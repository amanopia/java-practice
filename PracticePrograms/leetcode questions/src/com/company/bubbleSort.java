package com.company;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){

        int[] arr = {1,2,3,5,4};
        boolean swapped;
//        System.out.print(Arrays.toString(bubble(arr)));
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            // for each step, max item will come at the last respective index
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }
            System.out.println("----------");
        }
        System.out.print("final sorted array: ");
        System.out.println(Arrays.toString(arr));
    }
    static int[] bubble(int[] arr){

        int temp = 0;
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
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
