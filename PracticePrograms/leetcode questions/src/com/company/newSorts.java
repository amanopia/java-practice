package com.company;

import java.util.Arrays;

public class newSorts {
    public static void main(String[] args){

        int[] arr = {5,4,3,2,1};

        // bubble sort
        System.out.print(Arrays.toString(bubbleSort(arr)));
        System.out.print(Arrays.toString(selection(arr)));
    }
    static int[] bubbleSort(int[] arr){

        // Here we take an element and compare it with its previous element and then swap them
        for(int outer = 0; outer < arr.length; outer++){

            for(int inner = 1; inner < arr.length - outer; inner++){
                if(arr[inner] < arr[inner-1]){
                    swap(arr, inner, inner-1);
                }
            }
        }
        return arr;
    }
    static int maxForSelectionSort(int[] arr,int last){
        int max = arr[0];
        int maxIndex = 0;

        for(int index = 0; index <= last; index++){
            if(arr[index] > max){
                max = arr[index];
                maxIndex = index;
            }
        }
        return maxIndex;
    }

    static int[] selection(int[] arr){
        for(int index = 0; index < arr.length; index++){

            int last = arr.length - index - 1;
            int max = maxForSelectionSort(arr,last);
            swap(arr, max, last);

        }
        return arr;
    }

    static void swap(int[] arr, int first, int last){

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }
}
