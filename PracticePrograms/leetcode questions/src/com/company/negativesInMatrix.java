package com.company;

public class negativesInMatrix {
    public static void main(String[] args){
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.print(negatives(arr));
    }
    static int negatives(int[][] arr){
        int count = 0;
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
              if(arr[row][col] < 0){
                  count++;
              }
            }
        }
        return count;
    }
}
