package com.company;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        float age = in.nextInt();
        System.out.println(eligible(age));
    }
    public static boolean eligible(float a){
        boolean isEligible;
        if(a >= 18){
            isEligible = true;
        } else {
            isEligible = false;
        }

        return isEligible;
    }
}
