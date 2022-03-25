package com.company;

import java.util.Arrays;

public class CyclicSort2 {
    public static void main(String[] args){
        int[] arr = {2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int index = 0;
        while(index<arr.length){
            int correct = arr[index] - 1;
            if(arr[index] != arr[correct]){
                swap(arr, index, correct);
            }
            index++;
        }
        return arr;
    }
    static void swap(int[] arr, int index, int correct){
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;
    }
}
