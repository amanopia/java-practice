package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class SearchIn2DArrays {

    public static void main(String[] args){
//        int[][] arr = new int[3][4];
        Scanner in = new Scanner(System.in);
//
//        for(int row = 0; row<arr.length; row++){
//            for(int col = 0; col<arr[row].length; col++){
//                arr[row][col] = in.nextInt();
//            }
//        }
//
//        for(int[] row : arr){
//            for(int col = 0; col<row.length; col++){
//                System.out.print(arr[col]);
//            }
//        }


        int[][] arr = new int[3][2];
//        System.out.print(arr.length);

        for(int row = 0; row<arr.length; row++){
            // Taking input for every row
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        for(int row = 0; row<arr.length; row++){
            System.out.print(Arrays.toString(arr[row]));
        }

//        for(int row = 0; row<arr.length; row++){
//            for(int col = 0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ,");
//            }
//            System.out.println();
//        }
        for(int[] row : arr ){
            System.out.print(Arrays.toString(row));
        }
    }
}
