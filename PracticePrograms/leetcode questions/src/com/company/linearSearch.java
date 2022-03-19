package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        int[] arr = new int[1000000];

        System.out.print("Enter the target Element: ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();

        for(int index = 1; index<arr.length; index++){
            arr[index-1] = index;
        }
        long start = System.nanoTime();
        System.out.println(linearSearchh(arr,target));
        long end = System.nanoTime();
        System.out.println("Time elapsed: ");
        System.out.print(end - start + " ns");
    }

    static int linearSearchh(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index<arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
