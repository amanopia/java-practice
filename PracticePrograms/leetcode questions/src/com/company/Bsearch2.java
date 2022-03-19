package com.company;
import java.util.Scanner;

public class Bsearch2 {
    public static void main(String[] args){

        // Creating array of 1000 elements

        int[] arr = new int[1000];
        for(int index = 1; index<arr.length; index++){
            arr[index-1] = index;
        }

        // Taking in the target element to be searched

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer to be searched: ");
        int target = in.nextInt();

        // Calculating the time elapsed

        long start = System.nanoTime();
        System.out.println(binarySearch(arr, target)); // Function call
        long end = System.nanoTime();

        System.out.println("Time elapsed: ");
        System.out.println(end - start + " ns");
    }
    static int binarySearch(int[] arr, int target){
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;

            if(target < arr[mid]){
                endIndex = mid-1;
            } else if(target > arr[mid]){
                startIndex = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
