package com.company;

import java.util.*;

public class TestFile {
    public static void main(String[] args){
        char[] arr = {'a','b','c','d','e','f','g'};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an element to be searched: ");
        char target = in.next().charAt(0);
        System.out.println(target);
        System.out.print("The smallest character greater than the target element: ");
        System.out.print(smallestLargerThanTarget(arr, target));
    }

    static char smallestLargerThanTarget(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end ) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
