package com.company;

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        int i = 0;
        int product = 1;
        while((n - i) > 0){
            product = product * (n-i);
            i++;
        }
        System.out.println(product);

    }
}