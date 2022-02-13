package com.company;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the height: ");
        float base = in.nextFloat();
        System.out.print("Enter the base: ");
        float height = in.nextFloat();
        System.out.print("Enter the height: ");

        float area = base *  height;
        System.out.print("The area of parallelogram is: ");
        System.out.println(area + " sq. units");
    }

    // Test values: height: 12.3, base: 1.4
}
