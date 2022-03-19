package com.company;

import java.util.Scanner;

public class InsertPosition {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,7,8};


        Scanner in = new Scanner(System.in);
        System.out.print("Enter a target: ");
        int target = in.nextInt();

        System.out.print(index(arr, target));
    }
    static int index(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end ){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid  + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
