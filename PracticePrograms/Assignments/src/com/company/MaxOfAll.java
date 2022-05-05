package com.company;

import java.util.Scanner;

public class MaxOfAll {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int input = 0;
        int sum = 0;
        int max = 0;
        while((input = in.nextInt()) != 0){
            if(input > max){
                max = input;
            }
        }
        System.out.print(max);
    }
}