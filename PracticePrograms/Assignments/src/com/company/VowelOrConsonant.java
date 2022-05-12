package com.company;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char entry = in.next().charAt(0);

        switch(entry){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.print("Vowel");
            default -> System.out.print("Consonant");
        }

    }
}
