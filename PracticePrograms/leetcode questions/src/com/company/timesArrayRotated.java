package com.company;

public class timesArrayRotated {
    public static void main(String[] args){

        // In a rotated sorted array, we have to find the least element and check its index

        int[] arr = {12,15,18, 2,5,6,8,11};

        System.out.print(rotated(arr));

    }
    static int rotated(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + arr.length - 1] % arr.length && arr[mid] < arr[mid + 1] % arr.length){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            } else if (arr[mid] < arr[end]){
                end = mid - 1;
            }
        }
        return start;
    }
}

// The minimum element will always lie in the unsorted array