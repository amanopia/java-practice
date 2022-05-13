package com.company;

import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(maximum(a, b, c));
        System.out.println(minimum(a, b, c));
    }
    public static int maximum(int a, int b, int c ){
        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }
    public static int minimum(int a, int b, int c){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }
}
