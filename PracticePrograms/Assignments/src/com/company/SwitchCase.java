package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        String buff = "temsot";
        switch(buff) {
            case "hojn" -> System.out.println("Danii Kvyat");
            case "mark" -> System.out.println("Volron");
            case "temot" -> System.out.println("temsot");
            default -> System.out.println("velron");
        }
    }
}