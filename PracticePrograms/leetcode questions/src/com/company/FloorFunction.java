package com.company;

import javax.sound.midi.spi.SoundbankReader;
import java.util.*;

// here we are finding the biggest number smaller than or equal to the target number
public class FloorFunction {

    public static void main(String[] args){

        int[] arr = {1, 2, 4, 6, 10, 25, 28};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int target = in.nextInt();


        System.out.print(floor(arr, target));
    }
    static int floor( int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // What if the target element is smaller than the smallest element in the array

        if(target < arr[0]){
            return Integer.MIN_VALUE;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end ){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }



}
