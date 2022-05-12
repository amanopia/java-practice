package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){

        Scanner  in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int factSum = 0;
        for(int index = 1; index<num; index++){
            if(num%index == 0){
                factSum = factSum + index;
            }
        }
        System.out.println(factSum);
        if(factSum == num){
            System.out.print("Perfect Number");
        } else {
            System.out.print("Not a perfect number");
        }
    }
}
