package com.company;

// Find the peak index in an increasing and decreasing array
public class BitonicArray {
    public static void main(String[] args){
        int[] arr = {0,2,1,0};
        System.out.print(bitonic(arr));
    }
    static int bitonic(int[] arr){
        int peak = arr[0];
        for(int index = 0; index<arr.length-1; index++){
            if(arr[index+1]>arr[index]){
                peak = arr[index+1];
            }
        }
        return peak;
    }

}
