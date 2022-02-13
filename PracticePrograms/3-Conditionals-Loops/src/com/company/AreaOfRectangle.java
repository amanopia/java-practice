package com.company;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = in.nextFloat();
        System.out.print("Enter breadth: ");
        float breadth = in.nextFloat();

        float area = length * breadth;
        System.out.print("The area of rectangle is: ");
        System.out.print(area + " sq. units");
    }
}
