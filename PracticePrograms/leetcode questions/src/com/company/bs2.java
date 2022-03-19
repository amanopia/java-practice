package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class bs2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = in.nextInt();

        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 41, 48 },
                { 36, 38, 39, 58 }
        };
        int[][] arr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.print(Arrays.toString(bs(arr2,target)));
    }
    static int[] bs(int[][] arr, int target){
        int row = 0;
        int col = arr[row].length - 1;

        while(row<arr.length && col >=0){
            if(target < arr[row][col]){
                col--;
            } else if(target > arr[row][col]){
                row++;
            } else {
                return new int[] {row, col};
            }
        }
        return new int[] {-1,-1};
    }
}
