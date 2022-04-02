package com.company;

import java.util.Arrays;
public class FirstAndLastOccurrence {

    public static void main(String[] args) {
//                   0 1 2 3 4 5 6 7 8  9 10 11
        int[] arr = {1, 3, 3, 5, 6, 7, 8, 8, 9, 10, 11, 11};
        int target = 8;

        int firstOccurrence = firstAndLastOccurrence(arr, target, true);
        int lastOccurrence = firstAndLastOccurrence(arr, target, false);

        System.out.print(firstOccurrence);
        System.out.print(lastOccurrence);
    }

    // firstLast(arr, target, true) // for first occurrence
    static int firstAndLastOccurrence(int[] arr, int target, boolean firstOccurrence) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
//        int empEnd = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstOccurrence == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
