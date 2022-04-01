package com.company;

class Solution {
    public static void  main (String[] args) {

        int[] arr = {9,6,4,2,3,5,7,0,1};
        
        int i = 0;
        while(i< arr.length){
            int correct  = arr[i];
            
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {

                i++;
            }
            
        }
        for(int index = 0; index<arr.length; index++){
            if(arr[index] != index){
                System.out.print("Missing index: ");
                System.out.println(index);
            }
        }
        System.out.print("Array's length: ");
        System.out.print(arr.length);
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}