package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaOfEquilateralTriangle {
    public static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side length: ");
        float side = in.nextFloat();

        float area = (float) ((Math.sqrt(3)/4) * side * side);
        System.out.println(df.format(area) + " sq. units");
    }
}
