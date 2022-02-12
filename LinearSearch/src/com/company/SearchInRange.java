package com.company;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,5,67};
        int target = 2;
        int startIndex = 1;
        int endIndex = 7;

        System.out.println(searchInRange(arr, target, startIndex, endIndex));
    }
    static int searchInRange(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index <= end; index++){
            if(arr[index] == target){
                return index;
            }
        }
        // In case no cases are met return -1
        return -1;
    }

}
