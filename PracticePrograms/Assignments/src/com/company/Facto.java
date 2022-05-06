package com.company;

import java.util.Scanner;

public class Facto {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter r: ");
        int r = in.nextInt();
        System.out.print("Enter p: ");
        int p = in.nextInt();

        int ncr = factorial(n)/( (factorial(r)) * factorial(n-r));
        int npr = factorial(n)/( factorial(n-r));

        System.out.println("nCr: " + ncr);
        System.out.print("nPr: " + npr);

    }
    public static int factorial(int num){
        int fac = 1;
        int i = 0;

        while((num- i) > 0){
            fac = fac * (num-i);
            i++;
        }
        return fac;
    }
}
