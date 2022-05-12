package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int input = num;

        int ans = 0;
        int rem;
        while(num > 0){
            rem = num % 10;
            ans = (ans * 10) + rem;
            num = num / 10;
        }

        if( ans == input ){
            System.out.println("The number is a palindrome");
            System.out.println("Answer: " + ans);
            System.out.println("Number: " + input);
        } else {
            System.out.println("The number is not a palindrome");
            System.out.println("Answer: " + ans);
            System.out.println("Number: " + input);

        }
    }
}