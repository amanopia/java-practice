package com.company;

import java.util.Arrays;
public class FirstAndLastOccurrence {

    public static void main(String[] args){
//                   0 1 2 3 4 5 6 7 8  9 10 11
        int[] arr = {1,3,3,5,6,7,8,8,9,10,11,11};
        int target = 3;

        System.out.print(Arrays.toString(firstAndLastOccurrence(arr, target)));
    }
    static int[] firstAndLastOccurrence(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int empStart = 0;
//        int empEnd = 0;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            } else {
                if(arr[mid] == arr[mid+1]){
                    return new int[] {mid-1, mid};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
