package com.company;

public class MonotonicArray {
    public static void main(String[] args){
        int[] arr = {1,2,2,3};
        int[] arr2 = {5,4,4,3,2,1};
        int[] arr3 = {1,3,2,3};

        System.out.print(monotonic(arr));
    }
    static boolean monotonic(int[] arr){
        int start = 0;
        int end = arr.length-1;

        boolean monotonic = false;
        boolean isAsc = arr[start] < arr[end];

        if(isAsc){
            for(int index = 0; index<arr.length-1; index++){
                if (arr[index] <= arr[index + 1]) {
                    monotonic = true;
                } else {
                    monotonic = false;
                    break;
                }
            }
        } else if(!isAsc) {
            for(int index = 0; index<arr.length-1; index++){
                if(arr[index] >= arr[index+1]){
                    monotonic = true;
                } else {
                    monotonic = false;
                    break;
                }
            }
        } else{
            monotonic = false;
        }
        return monotonic;
    }
}
