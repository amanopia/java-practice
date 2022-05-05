package com.company;

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("radius: ");
        float radius = in.nextFloat();

        double volume = (4/3) * (Math.PI * Math.pow(radius, 3));
        System.out.println(volume);
    }
}
