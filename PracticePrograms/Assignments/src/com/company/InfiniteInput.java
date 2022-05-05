package com.company;

import java.util.Scanner;

public class InfiniteInput {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int input = 0;
        int sum = 0;
        while((input = in.nextInt()) != 0){
            sum = sum + input;
        }
        System.out.println(sum);
    }
}
