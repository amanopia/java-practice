package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        String buff = "tensor";
        switch (buff){
            case "pete" -> System.out.print("Drinks on me");
            case "tensor" -> System.out.print("Drinks on you");
            default -> System.out.print("We'll see who gets the drinks");
        }
    }
}