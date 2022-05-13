package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.println(EvenOd(a));
    }
    public static boolean EvenOd(int a){
        boolean even;

        if(a%2 == 0){
            even = true;
        } else {
            even = false;
        }
        return even;
    }
}
