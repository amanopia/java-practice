package com.company;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a  = in.nextInt();
        System.out.println(prime(a));

    }
    public static boolean prime(int a){
        boolean bool = false;
        if(a == 1 || a == 2){
            return true;
        }
        for(int i = 2; i<a; i++){
            if (a % i == 0) {
                bool = false;
                break;
            }
        }
        return bool;
    }
}
