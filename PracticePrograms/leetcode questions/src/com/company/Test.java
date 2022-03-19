package com.company;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int[] inputArray = {1,2,3,4,5,6,7,8};
        // {1,5,2,6,3,7,4,8}
        int[] arr = new int[inputArray.length];
        int n = inputArray.length/2;
        System.out.println(n);
        System.out.print(Arrays.toString(shuffle(arr, inputArray, n)));
    }
    static int[] shuffle(int[] arr, int[] inputArray, int n){
        if(inputArray.length == 0){
            return new int[]{-1,-1};
        }
        for(int index = 0; index<n; index+=2){
            arr[index] = inputArray[index];
            arr[index+1] = inputArray[index+n];
        }
        return arr;
    }

}
