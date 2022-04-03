package com.company;

import java.util.Scanner;

public class flo {


    public static void main(String[] args){
        int[] arr = {1,2,3,3,3,4,5,6,7,8,10,10,10};
                  // 0 1 2 3 4 5 6 7 8 9 10 11 12

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the element: ");
        int target = in.nextInt();

        int firstOccurrence = firlast(arr, target, true);
        int lastOccurrence = firlast(arr, target, false);

        System.out.println("First Occurrence = " + firstOccurrence);
        System.out.println("Last Occurrence = " + lastOccurrence);

        int count = lastOccurrence - firstOccurrence + 1;
        if(firstOccurrence == -1 && lastOccurrence == -1){
            System.out.print("Element not found.");
        } else {
            System.out.print("The total number of times the element occurs: " + count);
        }

    }
    static int firlast(int[] arr, int target, boolean firstOccurrence){

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                ans = mid;
                if(firstOccurrence == true){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
