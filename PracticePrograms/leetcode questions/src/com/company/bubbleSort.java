package com.company;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){

        int[] arr = {-1,7,-32,89};
//        System.out.print(Arrays.toString(bubble(arr)));
        for(int i = 0; i < arr.length; i++){
            // for each step, max item will come at the last respective index
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }

            }
            System.out.println("----------");
        }
    }
    static int[] bubble(int[] arr){

        int temp = 0;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
}
