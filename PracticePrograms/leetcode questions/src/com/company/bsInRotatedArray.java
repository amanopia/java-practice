package com.company;

public class bsInRotatedArray {
    public static void main(String[] args){
        int[] arr = {7,9,10,12,1,2,3,4};

        int peakElement = peak(arr);
        System.out.println(peakElement);
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[start] >= arr[mid]){
                end = mid - 1;
            } else if(arr[start] < arr[mid]){
                start = mid+1;
            } else {
                return -1;
            }
        }
        return arr[start];
    }
}
