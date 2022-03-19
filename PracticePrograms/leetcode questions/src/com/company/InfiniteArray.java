package com.company;


// Find the position of an element in an infinite sorted array

// ** Infinite array means that we will not consider the length of the array
// ----------
// To solve this, we will consider chunks of code
// We will then increase the size of the chunks (window) exponentially
import java.util.*;

public class InfiniteArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the target element: ");
        int target = in.nextInt();

        int[] arr = {1,2,3,4,5,7,8,12,13,14,16,22,24,26,28,31,32,34,38,39,40,60,76,78,88,90,92,94,96,99,102,104,123,234,345,456,678,789,890,1000};

        System.out.print("The index of the target element is: ");
        System.out.print(index(arr, target));

    }

    static int index(int[] arr, int target){
        int start = 0;
        int end   = 1;

        while(target > arr[end]){
            int newStart = end+1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
