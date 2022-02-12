package com.company;

public class MinimumNumber {
    public static void main(String[] args){
        int[] arr = {};
        System.out.print(minNum(arr));
    }
    static int minNum(int[] arr){

        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int min = arr[0];

        for(int index = 0; index < arr.length; index++){
            if(arr[index] < min){
                min = arr[index];
            }
        }
        return min;
//        return Integer.MIN_VALUE;
    }
}
