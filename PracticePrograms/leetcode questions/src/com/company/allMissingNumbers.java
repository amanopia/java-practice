package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class allMissingNumbers {
    public static void main(String[] args){

        int[] arr = {4,3,2,7,8,2,3,1};
        //          {1,2,2,3,3,4,7,8}
        //          {1,2,3,4,5,6,7,8}

        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        System.out.print(Arrays.toString(arr));
         List<Integer> ans = new ArrayList<>();
         for(int index = arr.length - 1; index >= 0; index--){
             if(arr[index] != index+1){
                 ans.add(arr[index]);
             }
         }
        System.out.println(ans);
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
