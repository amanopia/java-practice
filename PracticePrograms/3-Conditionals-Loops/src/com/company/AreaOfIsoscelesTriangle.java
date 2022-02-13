package com.company;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base length: ");
        float base = in.nextFloat();

        System.out.print("Enter the height length: ");
        float height = in.nextFloat();

        float area = (float)(0.5)*(base * height);
        System.out.print("Area of the isosceles triangle: ");
        System.out.print(area + " sq. units");

//        Test value: height: 1.4 , base: 12.3
    }

}
