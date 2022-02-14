package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class VolumeOfCone {

    public static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of cone: ");
        float height = in.nextFloat();
        System.out.print("Enter radius of circle: ");
        float radius = in.nextFloat();

        double volume = Math.PI * Math.pow(radius, 2) * (height/3);
        System.out.println(df.format(volume) + " sq. units");
    }
}
