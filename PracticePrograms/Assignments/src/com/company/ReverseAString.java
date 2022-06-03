package com.company;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.print(Arrays.toString(reverse(arr)));

    }
    static int[] reverse(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
    static void swap(int[] arr,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
