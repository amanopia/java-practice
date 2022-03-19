package com.company;

import java.util.Scanner;

// This funciton prints the next greatest integer of a given number and if that is not present, then prints the number itself
public class CeilingFunction {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 12,18, 34, 56, 78, 102};
        //           0  1  2  3  4  5  6    7   8   9   10

        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);

        int target = in.nextInt();

        System.out.print(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // What if the target number is greater than the greatest number in the array
        if(target > arr[arr.length-1]){
            return Integer.MAX_VALUE;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
