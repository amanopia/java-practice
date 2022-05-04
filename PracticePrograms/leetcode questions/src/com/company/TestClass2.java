package com.company;

import java.util.Scanner;

public class TestClass2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        float celcius = in.nextFloat();
        float faranheit = (Float)(celcius * 9/5) + 32;
        System.out.println(faranheit);


    }
}