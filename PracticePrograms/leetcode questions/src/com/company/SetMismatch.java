package com.company;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args){
        int[] arr = {2,2};
        int[] ans = new int[2];
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
        }
        for(int index = 0; index<arr.length; index++){
            if(arr[index] != index+1){
                ans = new int[]{index, index + 1};
            }
        }

    }
        System.out.print(Arrays.toString(ans));
    }
    static void swap (int[] arr, int index, int correct){
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;
    }
}
