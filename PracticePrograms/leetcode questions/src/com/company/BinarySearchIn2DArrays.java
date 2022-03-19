package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchIn2DArrays {
    public static void main(String[] args){
        int[][] arr = {
                {10,20,30,40,55},
                {15,25,35,45,56},
                {28,29,37,49,57},
                {33,34,38,50,58}
        };

        Scanner in = new Scanner(System.in);

        System.out.print("Enter target no.: ");
        int target = in.nextInt();

        System.out.print(Arrays.toString(BSearch2D(arr, target)));
    }
    static int[] BSearch2D(int[][] arr, int target){
        int row = 0;
        int col = arr[row].length-1;

        while(row<arr.length && col>=0){
            if(target < arr[row][col]){
                col--;
            } else if(target > arr[row][col]){
                row++;
            } else {
                return new int[] {row,col};
            }
        }
        return new int[] {-1,-1};
    }
}
