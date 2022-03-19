package com.company;

//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealthLeetcode1672 {

    public static void main(String[] args) {
        int[][] arr = { {1,2,3}, {3,2,1,6}, {1,3,56,2}};

        System.out.print("The maximum wealth is: ");
        System.out.print(richest(arr));
    }
    static int richest(int[][] arr){
        int max_wealth = Integer.MIN_VALUE;
        int sum = 0;
        for(int[] row: arr){
            sum = 0;
            for (int col : row) {
                sum += col;
            }
            if(sum > max_wealth){
                max_wealth = sum;
            }
        }
        return max_wealth;
    }
}
