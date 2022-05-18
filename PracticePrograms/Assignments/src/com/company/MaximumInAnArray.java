package com.company;

public class MaximumInAnArray {
    public static void main(String[] args){
        int[] arr = {1,2,24134234,3,454,4,576,342};
        int max = arr[0];

        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
