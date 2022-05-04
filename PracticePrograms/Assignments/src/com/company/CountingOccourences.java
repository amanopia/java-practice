package com.company;

import java.util.Scanner;

public class CountingOccourences {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int count = 0;


        while(num1 > 0){
            int rem = num1 % 10;
            if(rem == num2){
                count++;
            }
            num1 = num1/10;
        }
        System.out.print(count);
    }
}
