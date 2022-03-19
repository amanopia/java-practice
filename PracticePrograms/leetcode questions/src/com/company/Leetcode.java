package com.company;
import java.util.*;

public class Leetcode {
    public static void main(String[] args){

        int[] arr = {1,2,3,1,1,3};

        System.out.print(goodPair(arr));
    }
    static int goodPair(int[] arr){
        int count = 0;

        for(int outer = 0; outer<arr.length; outer++){
            for(int inner = outer + 1; inner<arr.length; inner++){
                if(arr[outer] == arr[inner]){
                    count++;
                }
            }
        }

        return count;
    }
}
