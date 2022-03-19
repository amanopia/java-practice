package com.company;

import java.util.Arrays;

public class MaxIn2d {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1000,23,15,34},
                {123,31,12,922},
                {13,2,32}
        };

        int ans = max(arr);
        System.out.println(ans);
        int[] ansIndex = indexOf(arr);
        System.out.println(Arrays.toString(ansIndex));
    }

    static int max(int[][] arr){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        int maximum = arr[0][0];

        for(int[] row: arr){
            for(int col: row){
                if(col > maximum){
                    maximum = col;
                }
            }
        }
        return maximum;
    }
    static int[] indexOf(int[][] arr){
        int rowMax = Integer.MIN_VALUE;
        int colMax = Integer.MIN_VALUE;

        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        int maximum = arr[0][0];
//        for(int[] row: arr){
//            for(int col : row){
//                return new int[]{row[col],col};
//            }
//        }
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] > maximum){
                    maximum = arr[row][col];
                    rowMax = row;
                    colMax = col;
                }
            }
        }

        return new int[]{rowMax, colMax};
    }
}
