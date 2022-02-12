package com.company;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {-1,2,3,4,5,6,324,423};
        int target = 1;
        System.out.print(linearSearch(nums, target));

    }
    // return the index if item found
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
//        for(int index = 0; index<arr.length; index++){
//            if(arr[index]== target){
//                return index;
//            }
//        }
        // Returning an item in case it is found
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE; // This signifies that no target element has been found
        // Prints the maximum value an integer can hold
    }

    // Returning a boolean in case an element is not present
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element: arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }

}
