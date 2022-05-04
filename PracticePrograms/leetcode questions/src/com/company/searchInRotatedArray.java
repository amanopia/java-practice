package com.company;


public class searchInRotatedArray {
    public static void main(String[] args){

        int[] arr = {2,3,4,7,9,10,12,1};

        System.out.println(pivot(arr));
        System.out.println(search(arr, 1));

    }
    static int search(int[] arr, int target){

        int pivot = pivot(arr);
        if(pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }if (arr[pivot] == target){
            return pivot;
        } if(target > arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        } else {
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end- start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + ( end - start )/2;
            if(mid < end && arr[mid] > arr[mid+1]){ // particular case check
                return mid;
            } else if(mid > start && arr[mid] < arr[mid-1]){ // particular case check
                return mid;
            } else if (arr[start] >= arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
