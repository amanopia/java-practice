package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

// Find a number in a mountain array
public class findNumberInMountain {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,8,3,2,1};
        System.out.println(peak(arr));;

//        Scanner in = new Scanner(System.in);
        int target = 4;
        int leftHalf = search(arr, target, 0, peak(arr));
        int rightHalf = search(arr, target, peak(arr)+1, arr.length-1);

        if(leftHalf != -1 && arr[leftHalf] == target){
            System.out.print("Output: " + leftHalf);
        } else if(rightHalf != -1 && arr[rightHalf] == target){
            System.out.print("Output: " + rightHalf);
        }


    }
    static int search(int[] arr, int target, int start, int end){

        if(arr[start] < arr[end]){
            while(start<=end){
                int mid = start + (end - start)/2;
                if(target > arr[mid]){
                    start = mid + 1;
                } else if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while(start <= end){
                int mid = start + (end - start)/2;
                if(target>arr[mid]){
                    end = mid - 1;
                } else if (target<arr[mid]){
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}