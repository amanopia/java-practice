package com.company;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/submissions/

public class ArrayFromPermutation {
    public static void main(String[] args){

        int[] arr = {5,0,1,2,3,4};
        System.out.print(Arrays.toString(permutations(arr)));
    }
    static int[] permutations(int[] arr){
        int[] permutedArray = new int[arr.length];

        for(int index = 0; index<arr.length; index++){
            if(index>=0 && index<arr.length){
                permutedArray[index] = arr[arr[index]];
            }
        }
        return permutedArray;
    }
}
