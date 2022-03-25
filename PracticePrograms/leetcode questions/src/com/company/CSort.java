package com.company;

import java.util.Arrays;

public class CSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};

        int index = 0;

        while(index < arr.length){
            int correct = arr[index] - 1;

            if(arr[index] != arr[correct]){
                swap(arr, index, correct);
            }
            index++;
        }
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index, int correct){
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;
    }
}
