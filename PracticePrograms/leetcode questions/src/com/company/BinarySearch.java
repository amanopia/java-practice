package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        // Creating and populating an array
//        int[] arr = new int[1000];
//        for(int populator = 0; populator<arr.length; populator++){
//            arr[populator] = populator;
//        }
        int[] arr = {1, 2, 3, 4, 5, 6, 12, 34, 56, 78, 102};
//        int[] arr = {97, 65, 54, 43, 32, 21, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //            0  1   2   3   4   5   6   7   8  9 10  11 12 13 14 15 16

        System.out.print("Enter an element: ");
        Scanner in = new Scanner(System.in);

        int target = in.nextInt();

        System.out.print(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 0){
            return -1;
        }

        boolean isAsc = arr[start] < arr[end];
        // Ascending order array
        if(isAsc){
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target > arr[mid]){
                    start = mid + 1;
                } else if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    return mid;
                }
            } // Descending order array
        } else {
            while( start <= end){
                int mid = start + (end - start)/2;
                if(target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]){
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
