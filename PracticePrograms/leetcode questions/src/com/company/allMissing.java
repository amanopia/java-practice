package com.company;

import java.util.ArrayList;
import java.util.List;

public class allMissing {
    public static void main(String[] args){

        int[] arr = {1,1,1};

        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        System.out.print(ans);
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
