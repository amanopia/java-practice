package com.company;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int num = in.nextInt();

        System.out.print(palindrome(num));

    }

    static int product(int num){
        int rem;
        int multiply = 1;

        while(num>0){
            rem = num%10;
            multiply = rem * multiply;
            num = num/10;
        }
        return multiply;
    }

    static int sum(int num){
        int rem;
        int sumInt = 0;

        while(num>0){
            rem = num%10;
            sumInt = sumInt + rem;
            num = num /10;
        }
        return sumInt ;
    }

    static boolean palindrome(int num) {
//        int rem;
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;

        }
        return original == reverse;
    }
}
