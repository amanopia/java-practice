package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Leetcode2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,41,43,-1,100};
        System.out.print(Arrays.toString(smaller(arr)));
    }
    static int[] smaller(int[] arr){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        int[] copy = new int[arr.length];

        for(int outer = 0; outer<arr.length; outer++){
            for(int inner = 0; inner<arr.length; inner++){
                if(arr[outer]>arr[inner]){
                    copy[outer]++;
                }
            }
        }


//        return new int[] {-1,-1};
        return copy;
     }

}
