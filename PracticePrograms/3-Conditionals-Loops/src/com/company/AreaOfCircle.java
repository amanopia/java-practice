package com.company;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float radius = in.nextFloat();

        System.out.print("Area of circle: ");
        System.out.print(Math.PI * Math.pow(radius, 2) + " sq. units");

        //test value = 2.3
    }
}
