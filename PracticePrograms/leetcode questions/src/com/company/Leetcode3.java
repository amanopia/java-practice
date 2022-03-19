package com.company;

import java.util.Arrays;

// https://leetcode.com/problems/count-of-smaller-numbers-after-self/
public class Leetcode3 {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1};
        System.out.print(Arrays.toString(counts(arr)));
    }
    static int[] counts(int[] arr){
        int count = 0;
        int[] result = new int[arr.length];

        for(int outer = 0; outer< arr.length; outer++){
            for(int inner = outer+1; inner<arr.length; inner++){
                if(arr[inner]<arr[outer]){
                    count++;
                }
            }
            result[outer] = count;
            count = 0;
        }
        return result;
    }
}
