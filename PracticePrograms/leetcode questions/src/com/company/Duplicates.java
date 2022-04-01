package com.company;

import java.util.Arrays;
public class Duplicates {
    public static void main(String[] args){

        int[] arr = {3,1,3,4,2,7,5,6,8,8};

        int i = 0;

        while(i<arr.length){

            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for(int index = 0; index<arr.length; index++){
            if(arr[index] != index + 1){
                if(arr[index]!=arr[arr[index]]){
                    swap(arr, index, arr[index]);
                    System.out.println(Arrays.toString(arr));
                } else {
                    System.out.println(arr[index]);
                    break;
                }

            }
        }
    }
    static void swap(int[] arr ,int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
