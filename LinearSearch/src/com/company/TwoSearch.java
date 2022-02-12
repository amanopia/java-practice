package com.company;

public class TwoSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,5},
                {6,134,44},
                {5,78,232,54,6},
                {12,43,55,34,5}
        };

        int target = 134;

        System.out.print(search(arr,target));
    }

    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
//            return -1;
        }
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return arr[row][col];
                }
            }
        }
//        return -1;
    }


}
