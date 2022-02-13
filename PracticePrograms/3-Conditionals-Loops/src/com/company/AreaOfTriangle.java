package com.company;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter height: ");
        float height = in.nextFloat();
        System.out.print("Enter base: ");
        float base = in.nextFloat();

        float area = (float)(0.5)*(base*height); // type casting necessary
        System.out.print("The area of triangle is: ");
        System.out.print(area + " sq. units");

//         Test value: height: 1.4 , base: 12.3

//        System.out.println((float)(1/2));
    }
}
