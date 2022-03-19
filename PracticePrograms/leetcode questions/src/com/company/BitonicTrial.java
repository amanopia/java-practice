package com.company;

public class BitonicTrial {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,5,2,1};

        System.out.print(bitonic(arr));
    }
    static int bitonic(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + ( end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
        }
        return arr[start];
    }

}
