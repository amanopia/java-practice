package com.company;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10,23,15,34},
                {123,31,12,92},
                {13,2,32}
        };
        int target = 92;
        int ans[] = search2d(arr,target);
        System.out.print(search2d2(arr, target));
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2d(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
    static boolean search2d2(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
//                    return arr[row][col];
                    return true;
                }
            }
        }
        return false;
    }
}
