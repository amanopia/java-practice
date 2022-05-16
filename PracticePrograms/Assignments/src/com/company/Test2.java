package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] nums = new int[3][4];
        // Filling the array
        for(int row = 0; row<arr.length; row++){
            for(int col = 0;col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // output
        
    }
}
