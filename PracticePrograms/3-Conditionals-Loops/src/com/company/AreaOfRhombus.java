package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfRhombus {
    // To truncate up to two Decimal places
    public static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         System.out.print("Enter side length: ");
         float sideLength = in.nextFloat();
         System.out.print("Enter diagonal1 length: ");
         float diagonal1 = in.nextFloat();

         float diagonal2 = (float)(Math.sqrt(4 * Math.pow(sideLength, 2) - Math.pow(diagonal1, 2)));

        System.out.print("The area of rhombus is: ");
        System.out.print(df.format((diagonal1 * diagonal2)/2)  + " sq. units");

    }
}
