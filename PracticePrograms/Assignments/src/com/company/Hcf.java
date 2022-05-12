package com.company;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int commonFactor = 1;
        int highest;

        for(int index = 1; index<=num1; index++){
            int factor = num1 % index;
            for(int innerIndex = 1; innerIndex <=num2; innerIndex++){
                int factor2 = num2 % innerIndex;
                if(factor == factor2){
                    commonFactor = factor;
                }
                if(factor == 0 && factor2 == 0 && commonFactor > factor){

                }
            }
        }
    }
}
