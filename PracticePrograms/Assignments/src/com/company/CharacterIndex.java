package com.company;

import java.util.Scanner;

public class CharacterIndex{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        char text = in.next().trim().charAt(0);
        if(text >= 'a' && text <= 'z'){
            System.out.print("Smaller case");
        } else if(text >= 'A' && text <= 'Z'){
            System.out.print("Upper Case");
        }
    }
}