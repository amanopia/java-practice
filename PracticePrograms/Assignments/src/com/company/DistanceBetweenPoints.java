package com.company;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("x1: ");
        int x1 = in.nextInt();
        System.out.print("x2: ");
        int x2 = in.nextInt();
        System.out.print("y1: ");
        int y1 = in.nextInt();
        System.out.print("y2: ");
        int y2 = in.nextInt();

        int distanceX = (int) Math.pow((x2-x1), 2);
        int distanceY = (int) Math.pow((y2-y1), 2);
        double dPoints = Math.pow(distanceX+distanceY, 0.5);

        System.out.print("Distance between points: " + dPoints + " units");

    }
}
